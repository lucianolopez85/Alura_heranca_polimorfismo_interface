abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : Funcionario(
    nome, cpf, salario
) {
    abstract val senha: Int

    open fun autentica(senha: Int): Boolean{
        if (this.senha==senha){
            return true
        }
        return false
    }
}