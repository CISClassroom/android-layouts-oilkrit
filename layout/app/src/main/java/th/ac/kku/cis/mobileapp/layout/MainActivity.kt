package com.cis.lab.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.kku.cis.mobileapp.layout.ConstanActivity
import th.ac.kku.cis.mobileapp.layout.LinearActivity
import th.ac.kku.cis.mobileapp.layout.R
import th.ac.kku.cis.mobileapp.layout.RelativeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            val i = Intent(this, LinearActivity::class.java)
            startActivity(i)
        }
        button2.setOnClickListener{
            val i = Intent(this, RelativeActivity::class.java)
            startActivity(i)
        }
        button3.setOnClickListener{
                val i = Intent(this, ConstanActivity::class.java)
            startActivity(i)
        }
    }
}
