class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
) : Gerente(nome, cpf, salario, senha) {

    override fun bonificacao(): Double {
        return this.salario * 0.3
    }

    fun total():Double{
        return super.bonificacao() + salario + plr
    }
}