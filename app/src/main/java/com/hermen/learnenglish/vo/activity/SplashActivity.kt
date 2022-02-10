package com.hermen.learnenglish.vo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import com.hermen.learnenglish.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SystemClock.sleep(4000);
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent)
    }
}