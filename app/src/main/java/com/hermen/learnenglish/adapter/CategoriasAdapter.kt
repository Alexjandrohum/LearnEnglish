package com.hermen.learnenglish.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.hermen.learnenglish.R
import com.hermen.learnenglish.vo.activity.WordActivity

class CategoriasAdapter : RecyclerView.Adapter<CategoriasAdapter.ViewHolder> () {

    var listCategory: MutableList<String> = ArrayList()
    lateinit var context: Context

    fun CategoriasAdapter (listCategorys : MutableList<String>, context: Context) {
        this.context = context
        this.listCategory = listCategorys
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriasAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_menu, parent, false))
    }

    override fun onBindViewHolder(holder: CategoriasAdapter.ViewHolder, position: Int) {
        val item = listCategory.get(position)
        holder.bind(item, context, position)
    }

    override fun getItemCount(): Int {
        return listCategory.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val text = view.findViewById(R.id.textCategory) as TextView
        val lottie = view.findViewById(R.id.lottieItems) as LottieAnimationView

        fun  bind(category: String, context: Context, position: Int) {
            text.text = category
            when(position) {
                0 -> lottie.setAnimation(R.raw.focus)
                1 -> lottie.setAnimation(R.raw.brain_pregunta)
                2 -> lottie.setAnimation(R.raw.brain_circulo)
                3 -> lottie.setAnimation(R.raw.brain_colores)
                4 -> lottie.setAnimation(R.raw.brain_compu)
                5 -> lottie.setAnimation(R.raw.brain_focus)
                6 -> lottie.setAnimation(R.raw.brain_pila)
                7 -> lottie.setAnimation(R.raw.brain_pregunta)
                8 -> lottie.setAnimation(R.raw.bran_cabeza)
                9 -> lottie.setAnimation(R.raw.focus)
                10 -> lottie.setAnimation(R.raw.brain_compu)
            }
            lottie.setOnClickListener(View.OnClickListener {
                val intent = Intent(context, WordActivity::class.java)
                when(position+1) {
                    1 -> intent.putExtra("frases", 1)
                    2 -> intent.putExtra("frases", 2)
                    3 -> intent.putExtra("frases", 3)
                    4 -> intent.putExtra("frases", 4)
                    5 -> intent.putExtra("frases", 5)
                    6 -> intent.putExtra("frases", 6)
                    7 -> intent.putExtra("frases", 7)
                    8 -> intent.putExtra("frases", 8)
                    9 -> intent.putExtra("frases", 9)
                    10 -> intent.putExtra("frases", 10)
                }
                if (position+1 <8) {
                    context.startActivity(intent)
                } else {
                    Toast.makeText(context, "Próximamente...", Toast.LENGTH_SHORT).show()
                }
            })

            text.setOnClickListener(View.OnClickListener {
                val intent = Intent(context, WordActivity::class.java)
                when(position+1) {
                    1 -> intent.putExtra("frases", 1)
                    2 -> intent.putExtra("frases", 2)
                    3 -> intent.putExtra("frases", 3)
                    4 -> intent.putExtra("frases", 4)
                    5 -> intent.putExtra("frases", 5)
                    6 -> intent.putExtra("frases", 6)
                    7 -> intent.putExtra("frases", 7)
                    8 -> intent.putExtra("frases", 8)
                    9 -> intent.putExtra("frases", 9)
                    10 -> intent.putExtra("frases", 10)
                }
                if (position+1 <8) {
                    context.startActivity(intent)
                } else {
                    Toast.makeText(context, "Próximamente...", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}

