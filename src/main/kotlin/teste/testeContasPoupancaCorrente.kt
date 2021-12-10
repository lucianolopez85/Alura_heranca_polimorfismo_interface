import modelo.*

val coringa = object: Cliente(
    "Aparecido",
    "",
    1234,
    endereco = Endereco(bairro = "Ingleses")
) {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}
fun testeContasPoupancaCorrente() {
    var contaPoupanca = ContaPoupanca(
        "Hadassa",
        1001,
    )
    var contaCorrente1 = ContaCorrente(
        "Luciano",
        1002
    )
    var contaCorrente2 = ContaCorrente(
        "Leticia",
        1003,

        )
    var contaCorrente3 = ContaCorrente(
        "Lucas",
        1004,

        )
    var contaCoringa = ContaCorrente(
        "Coringa",
        1005,
    )
    val sistema = Sistema()
    sistema.entra(coringa, 1234)

    contaCorrente2.deposito(5000.0)
    contaCorrente2.transferencia(3000.0, contaPoupanca)
    contaPoupanca.deposito(100.0)
    println("Nome: ${coringa.nome +" Bairro: "+ coringa.endereco.bairro}")
    contaCoringa.deposito(20000.0)
    println("Saldo conta ${coringa.nome +": "+contaCoringa.saldo}")
    println("##################################\n")
    println("Saldo Conta Corrente : ${contaCorrente2.saldo}")
    println("Saldo Conta Poupança : ${contaPoupanca.saldo}")
    println("Total de conta $totalContas")
}