package com.example.practica0192kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnPulsar: Button
    private lateinit var btnLimpiar: Button
    private lateinit var btnCerrar: Button
    private lateinit var txtNombre: EditText
    private lateinit var lblSaludar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Relacionar los objetos
        btnPulsar = findViewById(R.id.btnSaludar)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnCerrar = findViewById(R.id.btnCerrar)
        txtNombre = findViewById(R.id.txtNombre)
        lblSaludar = findViewById(R.id.lblSaludo)

        // Codificar el evento clic del botón Pulsar
        btnPulsar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Validar
                if (txtNombre.text.toString().isEmpty()) {
                    Toast.makeText(
                        this@MainActivity,
                        "Faltó capturar información",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    val str = "Hola " + txtNombre.text.toString() + " ¿Cómo estás?"
                    lblSaludar.text = str
                }
            }
        })

        // Codificar el evento clic del botón Limpiar
        btnLimpiar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                txtNombre.text.clear()
                lblSaludar.text = ""
            }
        })

        // Codificar el evento clic del botón Cerrar
        btnCerrar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                finish()
            }
        })
    }
}