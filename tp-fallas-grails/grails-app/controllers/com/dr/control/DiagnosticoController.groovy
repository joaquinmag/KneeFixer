package com.dr.control

import rules.ControladorReglas
import lesiones.TipoLesion
import sintomas.*

class DiagnosticoController {

    String keyPreguntasRespuestas = "respuestas"
    String keyPreguntas = "preguntas"
    String keyLesionesPosibles = "lesiones_posibles"
    String keyLesionesDescartadas = "lesiones_descartadas"
        
    def index = { 
                
        if (!params.id) {
            
            def respuestas = []
            def lesionesPosibles = getAllLesiones()
            def lesionesDescartadas = []
            
            session[keyPreguntasRespuestas] = respuestas
            session[keyLesionesPosibles] = lesionesPosibles
            session[keyLesionesDescartadas] = lesionesDescartadas
            session[keyPreguntas] = cargarPreguntas()
            
            redirect(controller: "diagnostico", action: "index", params: [id: 1])
        }
        else {
            def preguntas = session[keyPreguntas]
            def respuestas = session[keyPreguntasRespuestas]
            def lesionesPosibles = session[keyLesionesPosibles]
            def lesionesDescartadas = session[keyLesionesDescartadas]
            
            Pregunta preguntaActual
                        
            int id = Integer.parseInt(params.id, 10)
            
            if (id <= preguntas.size() && lesionesPosibles.size() > 0){
                
                preguntaActual = preguntas[id - 1]
                return [ pregunta : preguntaActual.pregunta,
                    posiblesRespuestas : preguntaActual.posiblesRespuestas,
                    idPregunta : id,
                    respuestas : respuestas,
                    lesionesPosibles : lesionesPosibles,
                    lesionesDescartadas : lesionesDescartadas
                ]
            }
            else{
                String lesion = ''
                
                if (lesionesPosibles.size() > 0)
                    lesion = lesionesPosibles[0].getNombre()
                
                redirect(controller: "diagnostico", action: "result", params: [lesion : lesion])
            }
        }
    }
    
    def result = {        
        return [lesion : params.lesion]
    }
    
    def nextQuestion = {
        
        if (!params.idPregunta) {
            render(view: "index")
        }
        else {
            def preguntas = session[keyPreguntas]
            def respuestas = session[keyPreguntasRespuestas]
            int id = Integer.parseInt(params.idPregunta, 10) 
            
            def pregunta = preguntas[id - 1]
            pregunta.respuesta = params.opcion
            respuestas.add(pregunta)
    
            ejecutarReglas(respuestas)
                        
            int newId = Integer.parseInt(params.idPregunta,10) + 1
            redirect(action: "index", params: [id: newId])
        }
    }
    
    def previousQuestion = {
        
        def preguntas = session[keyPreguntas]
        def respuestas = session[keyPreguntasRespuestas]
        int id = Integer.parseInt(params.idPregunta, 10) 

        def pregunta = preguntas[id - 2]
        respuestas.remove(pregunta)
        
        ejecutarReglas(respuestas)

        int newId = Integer.parseInt(params.idPregunta,10) - 1
        redirect(action: "index", params: [id: newId])
    }
    
    def cargarPreguntas() {
        
        Pregunta pregunta1 = new Pregunta(
            pregunta : "¿Qué grado de dolor del paciente?",
            posiblesRespuestas : [ "Medio" , "Alto" , "Muy alto" ],
            descripcion : "Dolor"
        )
        
        Pregunta pregunta2 = new Pregunta(
            pregunta : "¿Qué grado de rigidez se observa en la rodilla del paciente?",
            posiblesRespuestas : [ "Bajo" , "Medio" , "Alto" ],
            descripcion : "Rigidez"
        )
        
        Pregunta pregunta3 = new Pregunta(
            pregunta : "¿Cuál es el nivel de estabilidad que se observa en la rodilla del paciente?",
            posiblesRespuestas : [ "Muy bajo" , "Normal" , "Bajo" ],
            descripcion : "Estabilidad"
        )
        
        Pregunta pregunta4 = new Pregunta(
            pregunta : "¿Cuál es la zona de dolor dominante en la rodilla del paciente?",
            posiblesRespuestas : [ "Anterior" , "Posterior" , "Ambas", "Frontal" ],
            descripcion : "Zona"
        )
        
        Pregunta pregunta5 = new Pregunta(
            pregunta : "¿Cuál fue el sonido presente al momento de la lesión?",
            posiblesRespuestas : [ "Crujiente" , "Seco" , "Ninguno" ],
            descripcion : "Sonido"
        )
        
        Pregunta pregunta6 = new Pregunta(
            pregunta : "¿Cuál es el nivel de inflamación que se observa en la rodilla del paciente?",
            posiblesRespuestas : [ "Medio" , "Alto" , "Muy alto" ],
            descripcion : "Inflamación"
        )
                
        def listaPreguntas = [ pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6 ]
        return listaPreguntas
    }
    
    // De acá para adelante podria estar dentro del jar pero es un poco fiaca hacerlo. =)
    def ejecutarReglas(preguntas){
        def sintomas = []
        
        // Obtenemos los sintomas para luego utilizarlo con el ControladorReglas.       
        for (pregunta in preguntas){
                    
            String sintoma_str = pregunta.descripcion
            String valor_str = pregunta.respuesta
        
            Sintoma sintoma = getSintoma(sintoma_str, valor_str)
            sintomas.add(sintoma)           
        }
        
        ControladorReglas reglas = new ControladorReglas(sintomas)
        def lesiones = reglas.ejecutar()
        
        // Obtenemos las lesiones que ya estan descartadas.
        def complemento = getAllLesiones()
        complemento.removeAll(lesiones)
        
        session[keyLesionesPosibles] = lesiones
        session[keyLesionesDescartadas] = complemento 
    }
    
    def getAllLesiones(){
        def lesiones = []
        lesiones.addAll(TipoLesion.asList())
        return lesiones
    }
    
    def getSintoma(String sintoma, String valor){
        
        def valores = ['Bajo' : Sintoma.Valor.BAJO,
                       'Medio' : Sintoma.Valor.MEDIO,
                       'Alto' : Sintoma.Valor.ALTO,
                       'Muy alto' : Sintoma.Valor.MUY_ALTO,                       
                       'Crujiente' : Sintoma.Valor.CRUJIENTE,
                       'Seco' : Sintoma.Valor.RUIDOSECO,
                       'Ninguno' : Sintoma.Valor.NINGUNO,
                       'Anterior' : Sintoma.Valor.ANTERIOR,
                       'Posterior' : Sintoma.Valor.POSTERIOR,
                       'Ambas' : Sintoma.Valor.AMBOS,
                       'Frontal' : Sintoma.Valor.FRONTAL,
                       'Normal' : Sintoma.Valor.NORMAL,
                       'Muy bajo' : Sintoma.Valor.MUY_BAJO,
        ]
                      
        Sintoma.Valor valorEnum = valores[valor]
        Sintoma sintomaClass
        
        switch(sintoma){
            case "Dolor":
            sintomaClass = new Dolor(valorEnum)
            break
            
            case "Estabilidad":
            sintomaClass = new Estabilidad(valorEnum)
            break
                
            case "Inflamación":
            sintomaClass = new Inflamacion(valorEnum)
            break
                
            case "Rigidez":
            sintomaClass = new Rigidez(valorEnum)
            break
                
            case "Sonido":
            sintomaClass = new Ruido(valorEnum)
            break
                            
            case "Zona":
            sintomaClass = new Zona(valorEnum)
            break                            
        }
                
        return sintomaClass        
    }
}
