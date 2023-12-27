package com.aristidevs.androidmaster

fun main() {
    val weekdays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekdays[2]) // Accedemos a la tercera posición con el índice 2.

    // for in
    for (position in weekdays) {
        println(position)
    }

    // for in (key, value)
    for ((position, value) in weekdays.withIndex()) {
        println("La posición $position contiene $value")
    }
}