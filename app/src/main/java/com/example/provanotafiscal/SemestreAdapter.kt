package com.example.provanotafiscal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SemestreAdapter(
    private val semestres: List<Semestre>,
    private val onClick: (Semestre) -> Unit
)
    : RecyclerView.Adapter<SemestreAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val semestreText = itemView.findViewById<TextView>(R.id.semestreText)

        fun bind(semestre: Semestre) {
            semestreText.text = "${semestre.semestre} de ${semestre.ano}"
            itemView.setOnClickListener { onClick(semestre) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_semestre, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(semestres[position])
    }

    override fun getItemCount() = semestres.size
}
