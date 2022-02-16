package com.hermen.learnenglish.vo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.hermen.learnenglish.R
import com.hermen.learnenglish.model.FrasesParte1
import com.hermen.learnenglish.model.Test
import java.util.*

class WordActivity : AppCompatActivity() {

    lateinit var word: TextView
    lateinit var tvLayout: TextInputLayout
    lateinit var tvEditText: TextInputEditText
    lateinit var btComprobar: Button
    lateinit var tvSignificado: TextView
    lateinit var tvIterador: TextView
    var test: Test = Test()
    var wordTest: FrasesParte1? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)
        initComponents()
        initTest()
    }

    fun initComponents() {
        word = findViewById(R.id.tv_word)
        tvLayout = findViewById(R.id.tv_input_layout)
        tvEditText = findViewById(R.id.tv_edit_text)
        btComprobar = findViewById(R.id.bt_comprobar)
        tvSignificado = findViewById(R.id.tvSig)
        tvIterador = findViewById(R.id.tvIterador)
    }

    fun initTest() {
        wordTest = test.obtenerPalabra()
        Log.i("WORD_INIT: ",""+wordTest)
        word.text = wordTest!!.significado
    }

    fun comprobarPalabra(view: View) {
        tvSignificado.text = ""
        tvLayout.error = ""

        if (test.getIterador() == 10) {
            Toast.makeText(this, "Test terminado", Toast.LENGTH_SHORT).show()
        } else {
            var valorEditText: String = tvEditText.text.toString()
            Log.i("VALOR_EDIT_TEXT: ", valorEditText)
            if (valorEditText != null && !valorEditText.trim().equals("")) {
                if (valorEditText.uppercase(Locale.getDefault()) == wordTest!!.palabra.uppercase(Locale.getDefault())) {
                    test.modificarList()
                    tvEditText.setText("")
                    tvIterador.text = test.getIterador().toString() + "/" + test.frasesParte1.size
                    getPalabra()
                    Toast.makeText(this, "Palabra correcta.", Toast.LENGTH_SHORT).show()
                } else {
                    tvSignificado.text = wordTest!!.palabra
                    Toast.makeText(this, "Palabra incorrecta.", Toast.LENGTH_SHORT).show()
                }
            } else {
                tvLayout.error = "Es requerida la palabra"
            }
        }
    }

    fun getPalabra() {
        if (test.getIterador() == 10) {
            Toast.makeText(this, "Test terminado", Toast.LENGTH_SHORT).show()
            word.text = "TERMINAAAADOOO"
        } else {
            wordTest = test.obtenerPalabra()
            while(wordTest == null) {
                wordTest = test.obtenerPalabra()
            }
            word.text = wordTest!!.significado
        }
    }
}