open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autenticacao(senha: Int) {
        if (this.senha == senha) {
            println("Autenticação autorizada")
        } else {
            println("Falha na autenticação")
        }
    }
}