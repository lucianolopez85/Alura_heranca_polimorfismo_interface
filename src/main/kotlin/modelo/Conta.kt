package modelo

var totalContas = 0
    private set

abstract class Conta(titular: String, conta: Int) {
    var saldo = 0.0
        protected set

    init {
        totalContas++
    }

    abstract fun deposito(valor: Double)

    abstract fun saque(valor: Double)

    abstract fun transferencia(valor: Double, destino: Conta)
}