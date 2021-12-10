package modelo

class ContaCorrente(
    titular: String,
    conta: Int
) : Conta(titular, conta) {
    override fun deposito(valor: Double) {
        saldo += valor
    }

    override fun saque(valor: Double) {
        saldo -= valor
    }

    override fun transferencia(valor: Double, destino: Conta) {
        saque(valor)
        destino.deposito(valor * 0.9998)
    }
}