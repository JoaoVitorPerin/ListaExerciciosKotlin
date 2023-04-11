//Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário.
//Alunos:
//Gabriel de Freitas Lima
//Igor Rubio Lazaroto
//João Vitor Perin
//Thiago Jungles Caron


fun imparPar(numero:Int): Boolean {
    if((numero % 2) == 0){
        return true
    }
    return false
}

fun main(){

    println(imparPar(1))
    println(imparPar(2))
    println(imparPar(3))
    println(imparPar(4))
}
