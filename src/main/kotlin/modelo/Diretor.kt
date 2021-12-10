package modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    var plr: Double,
    override val senha: Int
) : FuncionarioAdmin(
    nome, cpf, salario, senha
), Autenticavel {

    override fun bonificacao(): Double {
        return salario * 0.3
    }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun cargo() {
        println("Diretor")
    }

    fun total(): Double {
        return salario + plr + bonificacao()
    }
}