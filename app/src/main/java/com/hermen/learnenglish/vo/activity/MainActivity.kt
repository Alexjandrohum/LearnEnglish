package com.hermen.learnenglish.vo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hermen.learnenglish.R
import com.hermen.learnenglish.adapter.CategoriasAdapter

class MainActivity : AppCompatActivity() {

    lateinit var mReciclerView : RecyclerView
    val mAdapter : CategoriasAdapter =  CategoriasAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listCategory : MutableList<String> = ArrayList()

        /*listCategory.add(0, "Category1")
        listCategory.add(1, "Category2")
        listCategory.add(2, "Category3")
        listCategory.add(3, "Category4")
        listCategory.add(4, "Category5")
        listCategory.add(5, "Category6")
        listCategory.add(6, "Category7")
        listCategory.add(7, "Category8")
        listCategory.add(8, "Category9")
        listCategory.add(9, "Category10")
        listCategory.add(10, "Category11")*/
        for (i in 0..10) {
            listCategory.add(i, "Category "+i)
        }

        mReciclerView = findViewById(R.id.rvCategory) as RecyclerView
        mReciclerView.setHasFixedSize(true)
        mReciclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
        }
        //mReciclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.CategoriasAdapter(listCategory, this)
        mReciclerView.adapter = mAdapter
    }
}