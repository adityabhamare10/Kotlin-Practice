package com.aditya.lifecycleapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(this,
            "onCreate() is called",
            Toast.LENGTH_SHORT
        ).show()

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,
            "onStart() is called",
            Toast.LENGTH_SHORT
        ).show()

    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this,
            "onResume () is called",
            Toast.LENGTH_SHORT
        ).show()

    }



}