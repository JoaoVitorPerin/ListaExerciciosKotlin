//Crie uma função que receba uma lista de strings e retorne uma lista com todas
// as strings que começam com a letra "A", em ordem alfabética.

fun organizaLista(lista:Array<String>){
    lista.filter {  lista.any { it.startsWith("a") }}
    lista.sort()
    return println(lista)
}

var listaString:Array<String> = arrayOf("A dona aranha", "subiu pela parede veio",
"a chuva forte e", "a derrubou")

fun main() {
    organizaLista(listaString)
}