package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Lucas"
    var cpf:String = "123.123.123-11"

    inner class endereco {
        var rua:String = "rua azul 35"
    }
}

fun main() {
    val lucas = Pessoa()

    println(Pessoa().cpf)
    println(lucas.cpf)
    println(lucas.endereco().rua)

}