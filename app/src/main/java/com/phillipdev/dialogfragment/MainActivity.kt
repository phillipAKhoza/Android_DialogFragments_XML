package com.phillipdev.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnViewDialog : Button
    lateinit var name: TextView
    lateinit var age: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnViewDialog = findViewById(R.id.button)
        name = findViewById(R.id.textViewName)
        age = findViewById(R.id.textViewAge)

        btnViewDialog.setOnClickListener {

        }
    }
}