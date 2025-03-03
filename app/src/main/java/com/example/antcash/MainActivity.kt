package com.example.antcash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Cargar el layout XML de la pantalla de presentación
        setContentView(R.layout.activity_main)

        // Referenciar el botón desde el XML
        val btnStart: Button = findViewById(R.id.btnStart)
        btnStart.setOnClickListener {
            // inicia FormActivity
            startActivity(Intent(this, FormActivity::class.java))
        }
    }
}
