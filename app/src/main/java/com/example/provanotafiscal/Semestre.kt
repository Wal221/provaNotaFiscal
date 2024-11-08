package com.example.provanotafiscal

data class Semestre(
    val ano: Int,
    val semestre: String


) {
    override fun toString(): String {
        return "$semestre $ano"
    }
}

object SemestreData {
    fun getSemestres(): List<Semestre> {
        return listOf(
            Semestre(2018, "1º semestre"),
            Semestre(2018, "2º semestre"),
            Semestre(2022, "1º semestre"),
            Semestre(2019, "2º semestre"),
            Semestre(2020, "1º semestre"),
            Semestre(2020, "2º semestre"),
            Semestre(2021, "1º semestre"),
            Semestre(2021, "2º semestre"),
            Semestre(2022, "1º semestre"),
            Semestre(2022, "2º semestre"),
            Semestre(2023, "1º semestre"),
            Semestre(2023, "2º semestre"),
            Semestre(2024, "1º semestre"),
            Semestre(2024, "2º semestre"),
        )
    }
}
