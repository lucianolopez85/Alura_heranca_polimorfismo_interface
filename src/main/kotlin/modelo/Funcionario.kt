package modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract fun cargo()

    abstract fun bonificacao(): Double
}