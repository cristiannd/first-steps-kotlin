package com.aristidevs.androidmaster

fun main() {
    // inmutableList()
    mutableList()
}

fun inmutableList() {
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println("El tamaño es: ${readOnly.size}")
    println("El listado es: $readOnly")
    println("El primer día de la semana es: ${readOnly.first()}")
    println("El tercer día de la semana es: ${readOnly[2]}")
    println("El último día de la semana es: ${readOnly.last()}")

    val readOnlyFiltered = readOnly.filter { day -> day.contains("a") }
    println("Lista filtrada solo con días con 'a': $readOnlyFiltered")

    readOnly.forEach { day -> println("El día es: $day") }
}

fun mutableList() {
    val weekdays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    weekdays.add("Al último")
    weekdays.add(0, "Al principio")
    println(weekdays)
}