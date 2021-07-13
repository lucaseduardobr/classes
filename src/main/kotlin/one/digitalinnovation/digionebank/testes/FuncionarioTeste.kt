package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val caio = Funcionario(nome="caio" , cpf="123456789", salario = BigDecimal.valueOf(2222.34))
    println(caio.salario)




}