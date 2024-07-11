abstract class FiguraGeometrica{
    abstract fun calcularArea(): Double
}

class Rectangulo(val base: Double, val altura: Double): FiguraGeometrica(){
    override fun calcularArea(): Double {
        return base * altura
    }
}

class Circulo(val radio: Double): FiguraGeometrica(){
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}

fun main(){
    val rectangulo = Rectangulo(5.0,3.0)
    val circulo = Circulo(2.0)

    println("Area del rectangulo: ${rectangulo.calcularArea()}")
    println("Area del circulo: ${circulo.calcularArea()}")
}