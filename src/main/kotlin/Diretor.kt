class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    var plr: Double,
    override val senha: Int
) : FuncionarioAdmin(nome, cpf, salario, senha) {
    override fun bonificacao(): Double {
        return salario * 0.3
    }

    override fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            println("Autenticado")
            return true
        } else {
            println("Falha autenticação")
            return false
        }
    }

    fun total(): Double {
        return salario + plr
    }
}