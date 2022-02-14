package com.hermen.learnenglish.model

class Test {

    var frasesParte1: MutableList<FrasesParte1> = ArrayList()
    var ran: Int = 0
    var iterator: Int = 0

    fun initLista() {
        frasesParte1.add(0,  FrasesParte1("After you","Pase usted",0))
        frasesParte1.add(1,  FrasesParte1("Ages ago","Hace siglos",0))
        frasesParte1.add(2,  FrasesParte1("Alright then","Vale, venga, me parece bien",0))
        frasesParte1.add(3,  FrasesParte1("Are you alright","¿Estás bien? ¿te ocurre algo?",0))
        frasesParte1.add(4,  FrasesParte1("Are you out of your mind","¿Te has vuelto loco? ¿Cómo se te ocurre algo así?",0))
        frasesParte1.add(5,  FrasesParte1("At the end of the day","Al fin y al cabo",0))
        frasesParte1.add(6,  FrasesParte1("Better late than never","Más vale tarde que nunca",0))
        frasesParte1.add(7,  FrasesParte1("Bless you","¡Salud!",0))
        frasesParte1.add(8,  FrasesParte1("Break a leg","¡Suerte!",0))
        frasesParte1.add(9,  FrasesParte1("By all means","Por supuesto que sí",0))
    }

    fun  getFrasesParte1(): FrasesParte1? {
        var frase = obtenerPalabra()
        if(frase.isCorrect == 0) {
            frase.isCorrect = 1
            iterator = iterator + 1
            frasesParte1.set(ran, frase)
            return frase
        } else {
            return null
        }
    }

    fun obtenerPalabra(): FrasesParte1 {
        return frasesParte1.get(ran)
    }

    fun getRandom() {
        ran = (0..9).random()
    }
}

fun main() {
    var test = Test()
    test.initLista()
    println("SIZE: "+test.frasesParte1.size)
    while(test.iterator < test.frasesParte1.size) {
        println("ListaCompleta: "+test.frasesParte1)
        test.getRandom()
        println("Antes: "+test.frasesParte1.get(test.ran))
        if(test.frasesParte1.get(test.ran).isCorrect == 0) {
            test.frasesParte1.get(test.ran).isCorrect = 1
            println("Despues: "+test.frasesParte1.get(test.ran))
            test.iterator = test.iterator + 1
            println(test.iterator)
            println("ListaModificada: "+test.frasesParte1)
        }
    }
}