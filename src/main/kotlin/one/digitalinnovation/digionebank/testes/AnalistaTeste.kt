package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val caio = Analista(nome="caio maia" , cpf="123456789", salario = 2222.34)
    //printe de uma outra maneira
    imprimeRelatorioFuncionario.imprime(caio)


}


   //fun ImprimeRelatiorio(funcionario: Funcionario)=println(funcionario.toString()) //classe visivel para td o packpage