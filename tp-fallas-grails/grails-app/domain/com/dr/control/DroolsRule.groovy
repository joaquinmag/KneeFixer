package com.dr.control

class DroolsRule {

    String ruleKey
    String ruleDescription
    String ruleValue

    static mapping = {
        // Por alguna razón, esto va en falso...
        version false
        ruleValue type:'text'
    }

}