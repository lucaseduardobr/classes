package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario(
    override val nome:String,  //override para poder pegar os dados de Pessoa
    override val cpf:String,
    val salario: BigDecimal

): Pessoa(nome,cpf) {

}