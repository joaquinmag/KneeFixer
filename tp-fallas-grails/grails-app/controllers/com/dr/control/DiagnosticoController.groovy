package com.dr.control

class DiagnosticoController {

    String keyRespuestas = "respuestas"
    
    def index = { 
        def listaPreguntas = cargarPreguntas()
        if (!params.id) {
            redirect(controller: "diagnostico", action: "index", params: [id: 1])
        }
        else {
            Pregunta preguntaElegida
            int id = Integer.parseInt(params.id, 10)
            //si no esta dentro del rango posible de preguntas
            int size = listaPreguntas.size()
            if (id < 1 || id > size) {
                throw new Exception("No hay una pregunta asociada para el id: ${id}")
            }
            else {
                preguntaElegida = listaPreguntas[id-1]
                [ pregunta : preguntaElegida.pregunta, 
                    posiblesRespuestas : preguntaElegida.posiblesRespuestas, 
                    idPregunta : id,
                    respuestasActuales : session[keyRespuestas]
                  ]
            }
        }
    }
    
    def nextQuestion = {
        if (!params.idPregunta) {
            render(view: "index")
        }
        else {
            if (!session[keyRespuestas]) {
                def respuestas = [:]
                session[keyRespuestas] = respuestas
            }
            def respuestas = session[keyRespuestas]
            respuestas[params.idPregunta] = params.opcion
            session[keyRespuestas] = respuestas
            redirect(action: "index", params: [id: Integer.parseInt(params.idPregunta,10)+1])
        }
    }
    
    def cargarPreguntas() {
        Pregunta pregunta1 = new Pregunta(
            pregunta : "¿Cual es su nombre?",
            posiblesRespuestas : [ "Si" , "No" ]
        )
        
        Pregunta pregunta2 = new Pregunta(
            pregunta : "¿Que comida le gusta?",
            posiblesRespuestas : [ "Mucha" , "Poca" ]
        )
        
        def listaPreguntas = [ pregunta1, pregunta2 ]
        listaPreguntas
    }
}
