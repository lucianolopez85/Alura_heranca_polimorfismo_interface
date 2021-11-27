class ContaCorrente(
    titular: String,
    conta: Int
) : Conta(titular, conta) {

    override fun transferencia(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor + 0.1
            destino.saldo += valor
        } else {
            println("Saldo insuficiente")
        }
    }
}