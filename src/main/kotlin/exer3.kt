import java.util.Objects

//Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa"
//e ordene a lista em ordem alfabética pelo atributo "nome".

public class Pessoa(var nome:String, var idade:Int)

fun main() {
    var lista = arrayOf(Pessoa("Joao", 19), Pessoa("Igor", 19), Pessoa("Thiago", 19))
    lista.sortBy { it.nome }
    lista.forEach { println(it) }
}