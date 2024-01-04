package com.aristidevs.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aristidevs.androidmaster.firstapp.FirstAppActivity
import com.aristidevs.androidmaster.imccalculator.ImcCalculatorActivity
import com.aristidevs.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnToDoApp = findViewById<Button>(R.id.btnToDoApp)

        btnSaludarApp.setOnClickListener { navigateToSaludarApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnToDoApp.setOnClickListener { navigateToDoApp() }
    }

    private fun navigateToDoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}