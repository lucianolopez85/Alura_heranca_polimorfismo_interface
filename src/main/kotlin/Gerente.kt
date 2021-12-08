open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: Int,
) : FuncionarioAdmin(
    nome, cpf, salario, senha
), Autenticavel {

    override fun cargo() {
        println("Gerente")
    }

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}