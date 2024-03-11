package com.example.menuapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Starters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
       super.onCreate(savedInstanceState)
        setContentView(R.layout.starters)

        val order = findViewById<Button>(R.id.orderStarter)
        order.setOnClickListener{
            val toast = Toast.makeText(this, "Your order has been placed. Please wait",Toast.LENGTH_LONG)
            toast.show()
        }
    }
}