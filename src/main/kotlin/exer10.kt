//Crie uma função que receba uma lista de strings e retorne uma lista com todas
// as strings que começam com a letra "A", em ordem alfabética.

fun organizaLista(lista:Array<String>){
    val filteredList: Array<String> = lista.filter { it.startsWith("a")}.toTypedArray()
    filteredList.sort()
    return println(filteredList.contentToString())
}

var listaString:Array<String> = arrayOf("a dona aranha", "subiu pela parede veio",
"a chuva forte e", "a derrubou ja passou", "a chuva o sol ja vai surgindo", "E a dona aranha continua",
"a subir")

fun main() {
    organizaLista(listaString)
}