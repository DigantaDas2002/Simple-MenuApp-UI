package com.example.menuapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val starters = findViewById<CardView>(R.id.crdStarters)
        val mainC = findViewById<CardView>(R.id.crdMaincourse)
        val beverages = findViewById<CardView>(R.id.crdBeverages)

        starters.setOnClickListener{
            intent = Intent(this, Starters::class.java)
            startActivity(intent)
        }
        mainC.setOnClickListener{
            intent = Intent(this, MainCourse::class.java)
            startActivity(intent)
        }
        beverages.setOnClickListener{
            intent = Intent(this, Beverages::class.java)
            startActivity(intent)
        }
    }
}