package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Lucas"
    var  cpf:String = "123.123.123-11" // var private cpf:String = "123.123.123-11" -- only visible for this class
    private set // para nao ser possivel alterar o CPF
    fun dadosDaPessoa() = "$cpf e $nome"
    inner class endereco {
        var rua:String = "rua azul 35"
    }
}

fun main() {
    val lucas = Pessoa()
    println(lucas.dadosDaPessoa())



}