package com.gzeinnumer.intentanimationkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import maes.tech.intentanim.CustomIntent.customType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //maven { url 'https://jitpack.io' }
        //implementation 'com.github.hajiyevelnur92:intentanimation:1.0'
        btn.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
            customType(this,"fadein-to-fadeout")
            //*left-to-right
            //*right-to-left
            //*bottom-to-up
            //*up-to-bottom
            //*fadein-to-fadeout
            //*rotateout-to-rotatein
        }
    }
}
