//Crie uma classe "Triangulo" com os atributos "base" e "altura".
// Adicione um método chamado "area" que calcula e retorna a área do triângulo.

class Triangulo(var base:Float, var altura:Float){
    fun area(){
        // var area = (this.base * this*altura) / 2
        // println("Area do triangulo: $area")
    }
}

fun main() {
    var tri = Triangulo(4f,2f)
    tri.area()
}
