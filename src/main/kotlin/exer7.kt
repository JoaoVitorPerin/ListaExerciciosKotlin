//Crie uma classe "Funcionario" com os atributos "nome", "idade" e
// "salario". Crie uma função que receba uma lista de funcionários e
// retorne o funcionário com o maior salário.
data class Funcionario(var nome:String, var idade:Int, var salario:Float)

fun organizarFuncionarios(lista:Array<Funcionario>){
    var maior:Funcionario = lista[0]
    for (funcionario in lista){
        if (funcionario.salario > maior.salario){
            maior = funcionario
        }
    }
    println("Funcionario com maior salario: $maior")
}

var lista = arrayOf(
    Funcionario("Joao", 19,2000f),
    Funcionario("Igor", 19,3000f),
    Funcionario("Thiago", 19,2500f),
    Funcionario("Gabriel", 19,2100f))

fun main() {
    organizarFuncionarios(lista)
}