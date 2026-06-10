package com.example.imadexam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    //Declarations
    private lateinit var edtShelterItems: EditText
    private lateinit var edtFoodItems: EditText
    private lateinit var edtSafetyItems: EditText
    private lateinit var tvDescription1: TextView
    private lateinit var tvDescription2: TextView
    private lateinit var tvDescription3: TextView
    private lateinit var btnDetailScreen: Button
    private lateinit var btnStart: Button










    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}