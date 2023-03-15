//Crie uma função que receba uma lista de strings e retorne a string mais longa da lista.

val listaStrings:Array<String> = arrayOf("batatas assadas", "comi pizza", "beber refrigerante")

fun comparaStringArray(lista:Array<String>){
    var maior = ""
    for (frase in lista){
        if (frase.count() > maior.count()){
            maior = frase
        }
    }
    println("Maior frase no array: $maior")
}

fun main() {
    comparaStringArray(listaStrings)
}