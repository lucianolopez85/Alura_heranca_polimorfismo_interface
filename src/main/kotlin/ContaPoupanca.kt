class ContaPoupanca(
    titular: String,
    conta: Int,
) : Conta(titular, conta) {
    override fun deposito(valor: Double) {
        this.saldo += valor*1.007
    }
}