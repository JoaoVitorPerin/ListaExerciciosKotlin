//Crie uma classe "Triangulo" com os atributos "base" e "altura".
// Adicione um método chamado "area" que calcula e retorna a área do triângulo.

data class Triangulo(var base:Int, var altura:Int){
    fun area(){
        var area = (this.base * this.altura) / 2
        println("Area do triangulo: $area")
    }
}

private operator fun Int.times(triangulo: Triangulo) {

}

fun main() {
    var tri = Triangulo(8,12)
    tri.area()
}
