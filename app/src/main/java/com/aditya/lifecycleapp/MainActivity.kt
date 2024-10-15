package com.aditya.lifecycleapp

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btn : Button
    lateinit var textView : TextView
    lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btn = findViewById(R.id.goBtn)
        textView = findViewById(R.id.textView)
        btn.setOnClickListener {
            //Explicit Intent
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("msg", textView.text.toString())
            startActivity(i)

        }

        btn2 = findViewById(R.id.openwebpg)

        btn2.setOnClickListener{

//            val i = Intent(Intent.ACTION_WEB_SEARCH)
//            i.putExtra(SearchManager.QUERY, "android")
//            startActivity(i)

            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com")
            )
            startActivity(i)

        }


    }



}