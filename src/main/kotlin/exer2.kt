//Crie uma função que receba um array de inteiros e retorne o maior número.
val listaNumeros:IntArray = intArrayOf(1,2,3,4,12,6,7,8,9,10)

fun checarMaior(lista:IntArray){
    var maior = 0;
    for (numero in lista){
        if (numero > maior){
            maior = numero
        }
    }
    println("Maior Numero = $maior")
}

fun main() {
    checarMaior(listaNumeros)
}