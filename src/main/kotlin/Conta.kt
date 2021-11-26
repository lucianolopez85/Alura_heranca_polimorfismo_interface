class Conta(titular: String, conta: Int) {
    var saldo = 0.0
        private set

    fun deposito(valor: Double) {
        this.saldo += valor
    }

    fun saque(valor: Double) {
        this.saldo -= valor
    }

    fun transferencia(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
        } else {
            println("Saldo insuficiente")
        }
    }
}