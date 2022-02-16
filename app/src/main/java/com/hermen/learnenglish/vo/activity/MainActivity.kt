package com.hermen.learnenglish.vo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.hermen.learnenglish.R
import com.hermen.learnenglish.adapter.CategoriasAdapter

class MainActivity : AppCompatActivity() {

    lateinit var mReciclerView : RecyclerView
    val mAdapter : CategoriasAdapter =  CategoriasAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listCategory : MutableList<String> = ArrayList()
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