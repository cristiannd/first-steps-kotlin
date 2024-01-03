package com.aristidevs.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.aristidevs.androidmaster.R
import com.aristidevs.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)

        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()

        when(result) {
            in 0.00..18.50 -> { // Peso bajo
                tvResult.text = getString(R.string.title_low_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.low_weight))
                tvDescription.text  = getString(R.string.description_low_weight)
            }
            in 18.51..24.99 -> { // Peso normal
                tvResult.text = getString(R.string.title_regular_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.regular_weight))
                tvDescription.text = getString(R.string.description_regular_weight)
            }
            in 25.00..29.99 -> { // Sobrepeso
                tvResult.text = getString(R.string.title_high_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.high_weight))
                tvDescription.text = getString(R.string.description_high_weight)
            }
            in 30.00..99.00 -> { // Obesidad
                tvResult.text = getString(R.string.title_critical_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.critical_weight))
                tvDescription.text = getString(R.string.description_critical_weight)
            }
            else -> { //Error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.critical_weight))
                tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}