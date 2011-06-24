package com.dr.control

class DiagnosticoController {

    def index = { 
        session['cosas'] = 'lala'
    }
}
