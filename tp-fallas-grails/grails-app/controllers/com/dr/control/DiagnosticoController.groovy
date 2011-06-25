package com.dr.control

import rules.ControladorReglas
import lesiones.TipoLesion
import sintomas.*

class DiagnosticoController {

    String keyPreguntasRespuestas = "respuestas"
    String keyPreguntas = "preguntas"
        
    def index = { 
                
        if (!params.id) {
            
            def respuestas = []
            session[keyPreguntasRespuestas] = respuestas
            session[keyPreguntas] = cargarPreguntas()
            redirect(controller: "diagnostico", action: "index", params: [id: 1])
        }
        else {
            def preguntas = session[keyPreguntas]
            def respuestas = session[keyPreguntasRespuestas]
            
            Pregunta preguntaActual
                        
            int id = Integer.parseInt(params.id, 10)
            
            if (id < preguntas.size()){
                
                preguntaActual = preguntas[id - 1]
                return [ pregunta : preguntaActual.pregunta,
                         posiblesRespuestas : preguntaActual.posiblesRespuestas,
                         idPregunta : id,
                         respuestas : respuestas ]
            }
        }
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
                        
            int newId = Integer.parseInt(params.idPregunta,10) + 1
            redirect(action: "index", params: [id: newId])
        }
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
            posiblesRespuestas : [ "Bajo" , "Medio" , "Alto" ],
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
}
