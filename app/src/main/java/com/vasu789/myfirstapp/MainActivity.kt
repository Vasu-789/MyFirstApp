package com.vasu789.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val textView = findViewById<TextView>(R.id.textView3)
        var timesClicked = 0
        var text = "Clicked "
        btnClickMe.setOnClickListener {
            timesClicked++
            textView.text = text + timesClicked.toString()
            Toast.makeText(this, "Hey, I'm A Toast!", Toast.LENGTH_LONG).show()
        }
    }
}