package com.example.taller15___nicolasquicenoyrobinlpez


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val editTextPassword = findViewById<TextInputEditText>(R.id.contraseña)
        val btnIniciar = findViewById<Button>(R.id.iniciarSesion)

        btnIniciar.setOnClickListener {
            val password = editTextPassword.text?.toString()?.trim()
            if (password.isNullOrEmpty()) {
                Toast.makeText(this, "La contraseña esta vacía", Toast.LENGTH_SHORT).show()
            } else {
                navigateToMenu()
            }
        }

        // Ajustar insets para que no se superponga con la barra del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToMenu() {
        val intent = Intent(this, menuActivity::class.java)
        startActivity(intent)
    }
}
