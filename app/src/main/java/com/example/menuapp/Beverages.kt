package com.example.menuapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Beverages : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beverages)

        val order = findViewById<Button>(R.id.orderBeverage)
        order.setOnClickListener{
            val toast = Toast.makeText(this, "Your order has been placed. Please wait",Toast.LENGTH_LONG)
            toast.show()
        }
    }
}