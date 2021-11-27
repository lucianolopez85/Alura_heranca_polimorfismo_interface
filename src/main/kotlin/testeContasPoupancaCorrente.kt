fun testeContasPoupancaCorrente() {
    var CPHadassa = ContaPoupanca(
        "Hadassa",
        1001,
    )
    var CCHadassa = ContaCorrente(
        "Hadassa",
        1002
    )

    CCHadassa.deposito(5000.0)
    CCHadassa.transferencia(3000.0, CPHadassa)
    CPHadassa.deposito(100.0)

    println("Saldo Conta Corrente Hadassa: ${CCHadassa.saldo}")
    println("Saldo Conta Poupança Hadassa: ${CPHadassa.saldo}")
}