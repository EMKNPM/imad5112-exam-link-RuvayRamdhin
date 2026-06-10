package com.example.imadexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {

    //Declarations
    private lateinit var tvResult: TextView
    private lateinit var btnView: Button
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalied_view_screen)

        //Typecasting
        tvResult = findViewById(R.id.tvResult)
        btnView = findViewById(R.id.btnView)
        btnBack = findViewById(R.id.btnBack)


        //Making the btnBack code for the button
        //This is go back to the main screen
        btnBack.setOnClickListener {
            intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }

        //making the code for the btnView
        //This will display all  the code the user has entered
        btnView.setOnClickListener {
            
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}