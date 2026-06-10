package com.example.imadexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splash : AppCompatActivity() {

    //Declarations
    private lateinit var btnStart: Button
    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)


        //typecasting
        btnStart = findViewById(R.id.btnStart2)
        btnExit = findViewById(R.id.btnExit2)

        //Making the button for the start
        //This is to move to the next screen
        btnStart.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }

        //Making the for exit
        //This is to exit the app when the user is done
        btnExit.setOnClickListener {
            finishAffinity()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}