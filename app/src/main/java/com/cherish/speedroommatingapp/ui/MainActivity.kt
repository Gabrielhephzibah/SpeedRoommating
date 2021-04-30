package com.cherish.speedroommatingapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cherish.speedroommatingapp.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
    }
}
