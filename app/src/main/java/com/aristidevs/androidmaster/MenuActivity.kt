package com.aristidevs.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aristidevs.androidmaster.firstapp.FirstAppActivity
import com.aristidevs.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)

        btnSaludarApp.setOnClickListener { navigateToSaludarApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
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