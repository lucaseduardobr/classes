package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "ronaldo nazario",
        cpf = "1243253656",
        clienteTipo = ClienteTipo.PF,
        senha = "456")

    println(jose)
    AutenticacaoTeste().autentica(jose)
}

