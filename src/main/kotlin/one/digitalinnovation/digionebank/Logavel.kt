package one.digitalinnovation.digionebank

interface Logavel {   //toda interface eh abstrata, nao tem estado
    fun login():Boolean // basicamente ele diz o nome da funcao e o que ela deve retornar
    // é importante que el foi criada como interface
    //para que por exemplo a classe cliente pudesse utiliza la
    // se ela tivesse em funcionario esse metodo nao poderia ser usado
    //e se ela tivesse em pessoa td mundo deveria implementa -la
    // essa interface resolve o problema
}