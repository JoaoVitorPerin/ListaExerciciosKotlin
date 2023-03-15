//Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo
//(ou seja, pode ser lida da mesma forma de trás para frente).

fun main() {

    fun palindromo(palavra: String){
        var reverso = ""
        for (i in palavra.length - 1 downTo 0) {
            reverso += palavra[i]
        }
        if (palavra.equals(reverso)){
            println("true")
        }else{
            println("false")
        }
    }

    palindromo("arara")
    palindromo("anna")
    palindromo("joao")
}