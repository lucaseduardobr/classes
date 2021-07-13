package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco //it must be imported

fun main (){
    val digiOneBank = Banco("DigiOne",12) // aqui eu set a nossa data class Banco
    println(digiOneBank.numero)
    println(digiOneBank.nome)
    // digiOneBank.nome="Digitwo" // I cannot do it because our dataclass Bank unchangeable property once settled we cannot change it, I m not sure but I think it s just because of VAL declaration into Bank Class
    // you can just copy as is showed below
    val banco2 = digiOneBank.copy(nome = "banco2")
    println(banco2.nome)
    println(banco2.info())
}