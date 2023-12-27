package com.aristidevs.androidmaster

fun main() {

}

fun funciones() {
    // Por defecto, el parametro 'age' va a ser 0 siempre y cuando no se pase argumento cuando se utiliza la función
    fun showMyAge(age: Int = 0): Int {
        return age
    }

    // Se puede utilizar funciones de una línea de esta manera
    // El palabra 'return' se elimina
    fun showMyAgeFormatted(age: Int = 0): Int = age

    val currentAge: Int = showMyAge(28)
    print("Tengo $currentAge años")
}

fun variables() {
    // VARIABLES NUMÉRICAS

    // Int: -2,147,483,647 a 2,147,483,647
    val intExample: Int = 30

    // Long: -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    // Ocupa más memoria que Int
    val longExample: Long = 12345678910

    // Float
    // Soporta 6 decimales
    val floatExample: Float = 30.123455f

    // Double
    // Soporta 14 decimales y ocupa más memoria que los Float
    val doubleExample: Double = 30.123456789101112


    // VARIABLES ALFANUMÉRICAS

    // Char: Se usa comilla simple y solo soporta 1 caracter
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '%'

    // String: Se usa comilla doble
    val stringExample: String = "AristiDevs123"


    // VARIABLES BOOLEANAS

    // Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false


    // CONCATENAR
    val nombre: String = "Cristian"
    val edad: Int = 28
    println("Hola, me llamo $nombre y tengo $edad años")


    // NULL
    // Se colocal ? luego del valor que puede contener
    val nullExample: String? = null ;

    // Queremos obtener la tercer letra del string
    // Hay que utilizar el ? antes del get por si el dato es nulo.
    // En caso de que el dato sea nulo, usamos el operador ?: para responder.
    nullExample?.get(2) ?: "Es un dato nulo, lo siento."
}