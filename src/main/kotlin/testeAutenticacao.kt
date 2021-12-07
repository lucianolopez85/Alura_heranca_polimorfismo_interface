fun testeAutenticacao(){
    val funcionario01 = Diretor(
        "Valter",
        "055.155.255-35",
        11000.0,
        4321.0,
        1234
    )
    funcionario01.bonificacao()
    println("Nome: ${funcionario01.nome}")
    println("Salário: ${funcionario01.salario}")
    println("Bonificação: ${funcionario01.bonificacao()}")
    funcionario01.autenticacao(1234)
    println("PLR: ${funcionario01.plr}")
    println("Total: ${funcionario01.total()}")

}