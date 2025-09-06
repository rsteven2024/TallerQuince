package com.example.taller15___nicolasquicenoyrobinlpez

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.card.MaterialCardView

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val cardCalculadora = findViewById<MaterialCardView>(R.id.cardCalculadora)
        val cardPromedio = findViewById<MaterialCardView>(R.id.cardPromedio)
        val cardConversor = findViewById<MaterialCardView>(R.id.cardConversor)
        val cardTipCalculator = findViewById<MaterialCardView>(R.id.cardTipCalculator)

        cardCalculadora.setOnClickListener { navigateToCalculadora() }
        cardPromedio.setOnClickListener { navigateToPromedio() }
        cardConversor.setOnClickListener { navigateToConversor() }
        cardTipCalculator.setOnClickListener { navigateToTipCalculator() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToCalculadora() {
        val intent = Intent(this, CalculadoraActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToPromedio() {
        val intent = Intent(this, ConversorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToConversor() {
        val intent = Intent(this, ConversorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTipCalculator() {
        val intent = Intent(this, TipCalculatorActivity::class.java)
        startActivity(intent)
    }
}
