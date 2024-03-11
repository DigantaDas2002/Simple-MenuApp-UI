package com.example.menuapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainCourse: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maincourse)

        val order = findViewById<Button>(R.id.orderMainCourse)
        order.setOnClickListener{
            val toast = Toast.makeText(this, "Your order has been placed. Please wait", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}