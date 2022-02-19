package com.hermen.learnenglish.vo.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.hermen.learnenglish.R
import com.hermen.learnenglish.model.FrasesParte1
import com.hermen.learnenglish.model.Test
import com.hermen.learnenglish.vo.fragment.DialogFragment
import java.util.*

class WordActivity : AppCompatActivity() {

    lateinit var word: TextView
    lateinit var tvLayout: TextInputLayout
    lateinit var tvEditText: TextInputEditText
    lateinit var btComprobar: Button
    lateinit var tvSignificado: TextView
    lateinit var tvIterador: TextView
    lateinit var imEye: ImageView
    var test: Test? = null
    var wordTest: FrasesParte1? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)
        initComponents()

        var tipoFrases: Int = intent.getIntExtra("frases",0)
        Log.i("TIPOFRASE",""+tipoFrases)
        when(tipoFrases) {
            1 -> test = Test(1)
            2 -> test = Test(2)
            3 -> test = Test(3)
            4 -> test = Test(4)
            5 -> test = Test(5)
            6 -> test = Test(6)
            7 -> test = Test(7)
        }
        initTest()
    }

    fun initComponents() {
        word = findViewById(R.id.tv_word)
        tvLayout = findViewById(R.id.tv_input_layout)
        tvEditText = findViewById(R.id.tv_edit_text)
        btComprobar = findViewById(R.id.bt_comprobar)
        tvSignificado = findViewById(R.id.tvSig)
        tvIterador = findViewById(R.id.tvIterador)
        imEye = findViewById(R.id.imEye)
    }

    private fun initTest() {
        tvEditText.requestFocus()
        wordTest = test!!.obtenerPalabra()
        word.text = wordTest!!.significado
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        tvIterador.text = test!!.getIterador().toString() + "/" + test!!.frasesParte1.size
        imEye.setOnClickListener(View.OnClickListener {
            showSignificado()
        })
    }

    fun comprobarPalabra(view: View) {
        tvSignificado.text = ""
        tvLayout.error = ""
        var valorEditText: String = tvEditText.text.toString()
        if (valorEditText != null && !valorEditText.trim().equals("")) {
            if (valorEditText.uppercase(Locale.getDefault()).trim() == wordTest!!.palabra.uppercase(Locale.getDefault()).trim()) {
                test!!.modificarList()
                tvEditText.setText("")
                tvIterador.text = test!!.getIterador().toString() + "/" + test!!.frasesParte1.size
                getPalabra()
            } else {
                tvLayout.error = "Significado incorrecto"
            }
        } else {
            tvLayout.error = "Es requerido"
        }
    }

    fun getPalabra() {
        if (test!!.getIterador() == test!!.frasesParte1.size) {
            word.text = ""
            val inputMethodManager: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(tvEditText.getWindowToken(), 0)
            showAlert()
        } else {
            wordTest = test!!.obtenerPalabra()
            while (wordTest == null) {
                wordTest = test!!.obtenerPalabra()
            }
            word.text = wordTest!!.significado
        }
    }

    fun showAlert() {
        val dialog = DialogFragment()
        dialog.isCancelable = false
        dialog.show(supportFragmentManager, "fragment")
    }

    fun finalizarPrueba(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun showSignificado() {
        tvSignificado.text = wordTest!!.palabra
    }
}