package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object{  // Esse objeto pode ser chamado por outras classes desse package
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }

}