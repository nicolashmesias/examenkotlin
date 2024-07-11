fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    println("la suma de los pares es: ")
    println(sumarPares(numeros))
}

fun sumarPares(numeros: Array<Int>): Int {
    var suma = 0

    for (i in numeros) {
        if (i % 2 == 0) {
            suma += i
        }
    }

    return suma
}


