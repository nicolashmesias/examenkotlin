fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun aplicarOperacion(numero: Int, funcion: (Int) -> Int): Int {
    return funcion(numero)
}

fun main (){
    println()
    println(aplicarOperacion(5, ::cuadrado))
}
