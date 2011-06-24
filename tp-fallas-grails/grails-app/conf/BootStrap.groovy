import com.dr.control.Pregunta

class BootStrap {

    def init = { servletContext ->
        Pregunta pregunta2 = new Pregunta(
            pregunta : "¿Cual es su nombre?",
            posiblesRespuestas : [ "Si" , "No" ]
        )
        pregunta2.save(flush:true)
        
        Pregunta pregunta3 = new Pregunta(
            pregunta : "¿Que comida le gusta?",
            posiblesRespuestas : [ "Mucha" , "Poca" ]
        )
        pregunta3.save(flush:true)
    }
    def destroy = {
    }
}
