package com.example.imadexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
    private lateinit var btnAddGear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        //Typecasting
        edtShelterItems = findViewById(R.id.edtShelterItems)
        edtFoodItems = findViewById(R.id.edtFoodItems)
        edtSafetyItems = findViewById(R.id.edtSafetyItems)
        tvDescription1 = findViewById(R.id.tvDescription1)
        tvDescription2 = findViewById(R.id.tvDescription2)
        tvDescription3 = findViewById(R.id.tvDescription3)
        btnDetailScreen = findViewById(R.id.btnDetailScreen)
        btnAddGear = findViewById(R.id.btnAddGear)


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

        //Makes sure that only thing that can be entered is a string
        val shelterItem = edtShelterItems.toString()
        val foodItem = edtFoodItems.toString()
        val safetyItem = edtSafetyItems.toString()

        //Another error handling to make sure all inputs fields are completed
        if (shelterItem.isEmpty() || foodItem.isEmpty() || safetyItem.isEmpty()){
            Toast.makeText(this, "Please complete all the fields!", Toast.LENGTH_SHORT).show()
            return
        }

        val description1 = tvDescription1.text.toString()
        val description2 = tvDescription2.text.toString()
        val description3 = tvDescription3.text.toString()

        if (description1.isEmpty() || description2.isEmpty() || description3.isEmpty()){
            Toast.makeText(this, "Please complete all the fields!", Toast.LENGTH_SHORT).show()
            return
        }













    }

















}