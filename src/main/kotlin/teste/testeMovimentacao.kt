import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testeMovimentacao() {
    var conta01 = ContaCorrente("Luciano", 1001)
    var conta02 = ContaPoupanca("Hadassa", 1002)

    conta01.deposito(1000.0)
    conta01.transferencia(500.0, conta02)
    conta02.saque(200.0)

    println("Saldo ${conta01.saldo}")
    println("Saldo ${conta02.saldo}")
}