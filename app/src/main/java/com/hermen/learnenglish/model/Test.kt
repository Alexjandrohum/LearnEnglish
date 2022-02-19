package com.hermen.learnenglish.model

import android.util.Log

class Test {

    var frasesParte1: MutableList<FrasesParte1>  = ArrayList()
    var ran: Int = 0
    var iterator: Int = 0

    constructor(tipoFrase: Int) {
        when(tipoFrase) {
            1 -> initLista1()
            2 -> initLista2()
            3 -> initLista3()
            4 -> initLista4()
            5 -> initLista5()
            6 -> initLista6()
            7 -> initLista7()
        }

    }

    fun initLista1() {
        frasesParte1 = ArrayList()
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

    fun initLista2() {
        frasesParte1 = ArrayList()
        frasesParte1.add(0,  FrasesParte1("By the way","Por cierto",0))
        frasesParte1.add(1,  FrasesParte1("Can you slow down","¿Puedes hablar más despacio?",0))
        frasesParte1.add(2,  FrasesParte1("Can you think of anything","¿Se te ocurre algo?",0))
        frasesParte1.add(3,  FrasesParte1("Carry on","Continúe.",0))
        frasesParte1.add(4,  FrasesParte1("Check it out","!Échale un vistazo!",0))
        frasesParte1.add(5,  FrasesParte1("Cheer up","¡Anímate!",0))
        frasesParte1.add(6,  FrasesParte1("Cheers","Gracias (informal) / Salud (al brindar)",0))
        frasesParte1.add(7,  FrasesParte1("Count me in","Cuenta conmigo",0))
        frasesParte1.add(8,  FrasesParte1("Good for you","¡Qué bien, me alegro por ti!",0))
        frasesParte1.add(9,  FrasesParte1("Hold on a moment","Espera un momento",0))
    }

    fun initLista3() {
        frasesParte1 = ArrayList()
        frasesParte1.add(0,  FrasesParte1("I guess so","Supongo que sí",0))
        frasesParte1.add(1,  FrasesParte1("I know what you mean","Sé a qué te refieres, te entiendo",0))
        frasesParte1.add(2,  FrasesParte1("I am only joking","¡Estoy bromeando!",0))
        frasesParte1.add(3,  FrasesParte1(" Indeed","Efectivamente",0))
        frasesParte1.add(4,  FrasesParte1("Is that ok for you","¿Te parece bien?",0))
        frasesParte1.add(5,  FrasesParte1("Keep it up"," ¡Muy bien, sigue así!",0))
        frasesParte1.add(6,  FrasesParte1("Lovely to see you","Me alegro de verte",0))
        frasesParte1.add(7,  FrasesParte1("Lucky you","¡Qué suerte la tuya!",0))
        frasesParte1.add(8,  FrasesParte1("Make yourself at home","Ponte cómodo, estás en tu casa",0))
        frasesParte1.add(9,  FrasesParte1("Me neither","Yo tampoco",0))
    }

    fun initLista4() {
        frasesParte1 = ArrayList()
        frasesParte1.add(0,  FrasesParte1("My pleasure","De nada, un placer",0))
        frasesParte1.add(1,  FrasesParte1("Never again","Nunca más",0))
        frasesParte1.add(2,  FrasesParte1("Never mind","Ok, olvídalo",0))
        frasesParte1.add(3,  FrasesParte1("No worries","Tranquilo, no hay problema",0))
        frasesParte1.add(4,  FrasesParte1("See you in a bit","Te veo en un rato",0))
        frasesParte1.add(5,  FrasesParte1("Sorry to bother you","Disculpe que le moleste",0))
        frasesParte1.add(6,  FrasesParte1("Sounds good to me","Hmm, suena bien",0))
        frasesParte1.add(7,  FrasesParte1("Stop talking nonsense","Deja de decir tonterías",0))
        frasesParte1.add(8,  FrasesParte1("Take it easy","Tómatelo con calma",0))
        frasesParte1.add(9,  FrasesParte1("Thanks anyway","Gracias de todos modos",0))
    }

    fun initLista5() {
        frasesParte1 = ArrayList()
        frasesParte1.add(0,  FrasesParte1("That is very kind of you","Es muy amable por su parte",0))
        frasesParte1.add(1,  FrasesParte1("There you go","Aquí tienes",0))
        frasesParte1.add(2,  FrasesParte1("To be honest with you","Si te soy sincero",0))
        frasesParte1.add(3,  FrasesParte1("What a shame","Qué pena",0))
        frasesParte1.add(4,  FrasesParte1("What is the matter","¿Qué pasa? ¿Hay algún problema?",0))
        frasesParte1.add(5,  FrasesParte1("Whatever","Lo que sea, sí claro, lo que tú digas",0))
        frasesParte1.add(6,  FrasesParte1("Where shall we meet","¿Dónde quedamos?",0))
        frasesParte1.add(7,  FrasesParte1("Who cares","A quién le importa",0))
        frasesParte1.add(8,  FrasesParte1("You made my day","Me has alegrado el día",0))
    }

    fun initLista6() {
        frasesParte1 = ArrayList()
        frasesParte1.add(0,  FrasesParte1("Hello everyone","Hola a todos",0))
        frasesParte1.add(1,  FrasesParte1("Thanks you for coming","Gracias por estar aqui",0))
        frasesParte1.add(2,  FrasesParte1("Can you repeat that please","¿Puedes repetir por favor?",0))
        frasesParte1.add(3,  FrasesParte1("Nice to meet you","Encantado de conocerte",0))
        frasesParte1.add(4,  FrasesParte1("Nice to meet you too","Encantado de conocerte también",0))
        frasesParte1.add(5,  FrasesParte1("You can call me","Puedes llamarme...",0))
        frasesParte1.add(6,  FrasesParte1("Oh is a pleasure to meet you","Oh, también es un placer para mí",0))
        frasesParte1.add(7,  FrasesParte1("Is time to go now","Es hora de irse",0))
        frasesParte1.add(8,  FrasesParte1("How are you","¿Cómo estas?",0))
        frasesParte1.add(9,  FrasesParte1("I am well","Estoy bien (Estar bien de salud)",0))
        frasesParte1.add(10,  FrasesParte1("I am great ","Estoy genial",0))
        frasesParte1.add(11,  FrasesParte1("I am tired","Estoy cansado",0))
        frasesParte1.add(12,  FrasesParte1("¿Why are you tired?","¿Por que estas cansado?",0))
        frasesParte1.add(13,  FrasesParte1("It is early here","Es temprano aqui",0))
        frasesParte1.add(14,  FrasesParte1("I am wonderful","Estoy de maravilla",0))
        frasesParte1.add(15,  FrasesParte1("I am good ","Estoy bien (Estar contento)",0))
    }
    fun initLista7() {
        frasesParte1 = ArrayList()
        frasesParte1.add(0,  FrasesParte1("I am sad ","Estoy triste",0))
        frasesParte1.add(1,  FrasesParte1("Why are you so sad","¿Por qué estás tan triste?",0))
        frasesParte1.add(2,  FrasesParte1("Because my dog is sick","Porque mi perro esta enfermo",0))
        frasesParte1.add(3,  FrasesParte1("It is ok","Está bien",0))
        frasesParte1.add(4,  FrasesParte1("I am stressed today","Estoy estresado hoy",0))
        frasesParte1.add(5,  FrasesParte1("Why are you stressed","¿Por qué estas estresada?",0))
        frasesParte1.add(6,  FrasesParte1("I have a lot of work","Tengo mucho trabajo",0))
        frasesParte1.add(7,  FrasesParte1("I am busy","Estoy ocupado",0))
        frasesParte1.add(8,  FrasesParte1("Why are you busy","¿Por qué estas ocupada?",0))
        frasesParte1.add(9,  FrasesParte1("I am planning a big party","Estoy planeando una gran fiesta",0))
        frasesParte1.add(10,  FrasesParte1("Sounds fun","Suena divertido",0))
        frasesParte1.add(11,  FrasesParte1("Nice talking to you","Encantado de hablar contigo",0))
        frasesParte1.add(12,  FrasesParte1("See you soon","¡Nos vemos pronto!",0))
    }

    fun modificarList() {
        frasesParte1.get(ran).isCorrect = 1
        iterator = iterator + 1
    }

    fun getIterador() : Int {
        return iterator
    }

    fun obtenerPalabra(): FrasesParte1? {
        getRandom(frasesParte1.size)
        Log.i("LIST_SIZE", ""+frasesParte1.size)
        Log.i("RANDOM", ""+ran)
        var palabra: FrasesParte1 = frasesParte1.get(ran)
        while(palabra.isCorrect != 1) {
            return palabra
        }
        return null
    }

    fun getRandom(data: Int) {
        ran = (0..data-1).random()
    }
}