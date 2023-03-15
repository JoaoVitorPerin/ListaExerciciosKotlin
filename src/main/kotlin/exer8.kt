//Crie uma função que receba uma lista de números inteiros e retorne
//uma lista com os números em ordem crescente, sem usar o método de ordenação da linguagem.

fun main() {
    fun bubbleSort(lista: IntArray) {
        println("Lista antes da ordenação: $lista")
        for (pass in 0 until (lista.size - 1)) {
            // A single pass of bubble sort
            for (posicaoAtual in 0 until (lista.size - pass - 1)) {
                // This is a single step
                if (lista[posicaoAtual] > lista[posicaoAtual + 1]) {
                    val i = lista[posicaoAtual]
                    lista[posicaoAtual] = lista[posicaoAtual + 1]
                    lista[posicaoAtual + 1] = i
                }
            }
        }
        println("Lista depois da ordenação: $lista")
    }

    var listaInteiros = intArrayOf(8,2,3,5,6,4,1,10,9)

    bubbleSort(listaInteiros)
}