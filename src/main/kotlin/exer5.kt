//Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". Adicione um método chamado "saque"
// que recebe um valor como parâmetro e subtrai do saldo da conta. Se o valor do saque for maior que o saldo da conta,
// o método deve lançar uma exceção com a mensagem "Saldo insuficiente".

class ContaBancaria(var saldo:Float, var limite:Float){
    fun saque(valor:Float){
        if (valor <= saldo) {
            saldo -= valor
            println("\nSaque: R$ $valor\nSaldo: R$ $saldo\n")
        } else{
            throw Exception("Saldo insuficiente!")
        }
    }
}

fun main() {
    var conta1 = ContaBancaria(400f,1000f)

    conta1.saque(100f)
    conta1.saque(1000f)
}