package com.example.provanotafiscal

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SecondTela : AppCompatActivity() {
    private val typeCont = arrayOf(
        "Corrente", "Poupança", "Pagamento", "Salario"
    )


    private val combo: Spinner by lazy { findViewById(R.id.inputConta) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_tela)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        /*
       essa Key e como se fosse o token que eu estou usando para dizer, quando vir algo da outra
       atividade que tiver essa chave KEY eu quero receber oque tive nela
       */
        val user = intent.getStringExtra("")

        val textVIew = findViewById<TextView>(R.id.textSecondView)


        if (user != null) {
            textVIew.text = user.name

        }







    }
}