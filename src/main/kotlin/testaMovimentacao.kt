fun testeMovimentacao() {
    var conta01 = Conta("Luciano", 1001)
    var conta02 = Conta("Hadassa", 1002)

    conta01.deposito(700.0)
    conta01.transferencia(600.0, conta02)
    conta02.saque(200.0)

    println("Saldo ${conta01.saldo}")
    println("Saldo ${conta02.saldo}")
}