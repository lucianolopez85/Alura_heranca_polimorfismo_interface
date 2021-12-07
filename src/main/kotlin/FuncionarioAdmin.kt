abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : Funcionario(nome, cpf, salario) {
    abstract val senha: Int

    abstract fun autenticacao(senha: Int): Boolean
}