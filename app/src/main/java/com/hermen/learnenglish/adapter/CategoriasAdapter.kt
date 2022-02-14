package com.hermen.learnenglish.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hermen.learnenglish.R

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

        fun  bind(category: String, context: Context, position: Int) {
            text.text = category
            text.setOnClickListener(View.OnClickListener {
                Toast.makeText(context, ""+position, Toast.LENGTH_LONG).show()
            })
        }
    }
}

