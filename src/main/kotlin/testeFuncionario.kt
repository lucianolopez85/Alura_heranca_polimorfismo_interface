fun testeFuncionario() {
    val funcionario01 = Funcionario(
        "Luciano",
        "055.155.255-35",
        5500.0,
    )
    val funcionario02 = Gerente(
        "Hadassa",
        "055.155.255-35",
        8000.0,
        1234
    )

    val funcionario03 = Diretor(
        "Valter",
        "055.155.255-35",
        11000.0,
        4321,
        600.0
    )

    funcionario01.bonificacao()
    println("Nome: ${funcionario01.nome}")
    println("Salário: ${funcionario01.salario}")
    println("Bonificação: ${funcionario01.bonificacao()}")
    println("##################################\n")

    funcionario02.bonificacao()
    println("Nome: ${funcionario02.nome}")
    println("Salário: ${funcionario02.salario}")
    println("Bonificação: ${funcionario02.bonificacao()}")
    funcionario02.autenticacao(1234)
    println("##################################\n")

    funcionario03.bonificacao()
    println("Nome: ${funcionario03.nome}")
    println("Salário: ${funcionario03.salario}")
    println("Bonificação: ${funcionario03.bonificacao()}")
    funcionario03.autenticacao(4321)
    println("PLR: ${funcionario03.plr}")
    println("Total: ${funcionario03.total()}")
    println("##################################\n")

    val calculadora = CalculadoraBonificacao()

    calculadora.registro(funcionario01)
    calculadora.registro(funcionario02)
    calculadora.registro(funcionario03)

    println("Valor Total Bonificação: ${calculadora.total}")
}