abstract class Conta(titular: String, conta: Int) {
    var saldo = 0.0
        protected set
//        private set

    abstract fun deposito(valor: Double)
//    {
//        this.saldo += valor
//    }

    abstract fun saque(valor: Double)
//    {
//        this.saldo -= valor
//    }

    abstract fun transferencia(valor: Double, destino: Conta)
//    {
//        if (saldo >= valor) {
//            saldo -= valor
//            destino.saldo += valor
//        } else {
//            println("Saldo insuficiente")
//        }
//    }
}