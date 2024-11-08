package com.example.provanotafiscal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    //private val combo: Spinner by lazy { findViewById(R.id.listSemestres) }


    val semestres = SemestreData.getSemestres()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        combo.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,semestres)
//            .apply { setDropDownViewResource(android.R.layout.simple_spinner_item) }

        val cpf = findViewById<T>()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = SemestreAdapter(semestres) { semestre ->
            val intent = Intent(this, SecondTela::class.java)
            intent.putExtra("cpf", )
            intent.putExtra("ano", semestre.ano)
            intent.putExtra("semestre", semestre.semestre)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}