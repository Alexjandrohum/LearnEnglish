package com.hermen.learnenglish.model

class FrasesParte1 {

    lateinit var palabra: String
    lateinit var significado: String
    var isCorrect: Int = 0

    constructor(palabra: String, significado: String, isCorrect: Int) {
        this.palabra = palabra
        this.significado = significado
        this.isCorrect = isCorrect
    }
    constructor()

    override fun toString(): String {
        return "FrasesParte1(palabra='$palabra', significado='$significado', isCorrect=$isCorrect)"
    }
}