package com.example.imadexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    //Declarations
    private lateinit var edtItem: EditText
    private lateinit var tvDescription: TextView
    private lateinit var btnDetailScreen: Button
    private lateinit var btnAddGear: Button
    private lateinit var btnSaveDescription: Button
    private lateinit var spnCategory: Spinner

    //making an array to save all the info
    val campingStuff = arrayOf("Shelter","Food", "Safety")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        //Typecasting
        edtItem = findViewById(R.id.edtItem)
        tvDescription = findViewById(R.id.tvDescription)
        btnSaveDescription = findViewById(R.id.btnSaveDescription)
        btnAddGear = findViewById(R.id.btnAddGear)
        spnCategory = findViewById(R.id.spnCategory)


        
        //Making the button for the next screen
        btnDetailScreen.setOnClickListener {
            intent = Intent(this, DetailedViewScreen::class.java)
            startActivity(intent)
        }

        //Making the btnAddGear save all it information
        btnAddGear.setOnClickListener {

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Making a function to save the all the info
    //that the user has entered
    private fun saveGearData(){









    }

















}