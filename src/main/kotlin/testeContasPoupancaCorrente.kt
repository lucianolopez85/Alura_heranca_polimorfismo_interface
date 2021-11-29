fun testeContasPoupancaCorrente() {
    var CPHadassa = ContaPoupanca(
        "Hadassa",
        1001,
    )
    var CCLuciano = ContaCorrente(
        "Hadassa",
        1002
    )

    CCLuciano.deposito(5000.0)
    CCLuciano.transferencia(3000.0, CPHadassa)
    CPHadassa.deposito(100.0)

    println("Saldo Conta Corrente Luciano: ${CCLuciano.saldo}")
    println("Saldo Conta Poupança Hadassa: ${CPHadassa.saldo}")
}