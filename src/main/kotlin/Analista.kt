class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome, cpf, salario
), Autenticavel {

    override fun cargo() {
        println("Analista")
    }

    override fun bonificacao(): Double {
        return salario * 0.1
    }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}