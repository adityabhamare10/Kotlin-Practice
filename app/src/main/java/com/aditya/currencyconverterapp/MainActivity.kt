package com.aditya.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

//    lateinit (late initiate) used when we use it later so it initiate later when we actually use it to avoid null pointer exception
    lateinit var editTextusd : EditText
    lateinit var btn : Button
    lateinit var result : TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editTextusd = findViewById(R.id.edt_usd)
        btn = findViewById(R.id.button)
        result = findViewById(R.id.result)

        btn.setOnClickListener{

            result.setText("₹"+(84.06*editTextusd.text.toString().toDouble().roundToInt()).toString())

        }

    }

}