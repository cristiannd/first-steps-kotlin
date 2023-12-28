package com.aristidevs.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.aristidevs.androidmaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight: Int = 70
    private var currentAge: Int = 28

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton
    private lateinit var tvWieght: TextView
    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAge: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvWieght = findViewById(R.id.tvWeight)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        tvAge = findViewById(R.id.tvAge)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender(isMaleSelected)
            setGenderColor()
        }

        viewFemale.setOnClickListener {
            changeGender(isFemaleSelected)
            setGenderColor()
        }

        rsHeight.addOnChangeListener { _, value, _ ->
            val decimalFormat = DecimalFormat("#.##")
            val formattedValue = decimalFormat.format(value)
            val centimeters = getString(R.string.centimeters, formattedValue)

            tvHeight.text = centimeters
        }

        btnSubtractWeight.setOnClickListener {
            if (currentWeight > 1) {
                currentWeight--
                setWeight()
            }
        }

        btnPlusWeight.setOnClickListener {
            if (currentWeight < 300) {
                currentWeight++
                setWeight()
            }
        }

        btnSubtractAge.setOnClickListener {
            if (currentAge > 1) {
                currentAge--
                setAge()
            }
        }

        btnPlusAge.setOnClickListener {
            if (currentAge < 150) {
                currentAge++
                setAge()
            }
        }
    }

    private fun setAge() {
        tvAge.text = currentAge.toString()
    }

    private fun setWeight() {
        tvWieght.text = currentWeight.toString()
    }

    private fun changeGender(genderSelected: Boolean) {
        if (!genderSelected) {
            isMaleSelected = !isMaleSelected
            isFemaleSelected = !isFemaleSelected
        }
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent)
            R.color.background_component_selected
        else
            R.color.background_component

        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }
}