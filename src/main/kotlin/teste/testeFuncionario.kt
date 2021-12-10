import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testeFuncionario() {

    val funcionario02 = Gerente(
        "Hadassa",
        "055.155.255-35",
        8000.0,
        4321
    )

    val funcionario03 = Diretor(
        "Valter",
        "055.155.255-35",
        11000.0,
        4321.0,
        1234
    )

    val funcionario04 = Analista(
        "Luciano",
        "055.155.255-35",
        5000.0,
        5555
    )

    funcionario02.bonificacao()
    println("Nome: ${funcionario02.nome}")
    println("Salário: ${funcionario02.salario}")
    println("Bonificação: ${funcionario02.bonificacao()}")
    println("##################################\n")

    funcionario03.bonificacao()
    println("Nome: ${funcionario03.nome}")
    println("Salário: ${funcionario03.salario}")
    println("Bonificação: ${funcionario03.bonificacao()}")
    println("PLR: ${funcionario03.plr}")
    println("Total: ${funcionario03.total()}")
    println("##################################\n")

    funcionario04.bonificacao()
    println("Nome: ${funcionario04.nome}")
    println("Salário: ${funcionario04.salario}")
    println("Bonificação: ${funcionario04.bonificacao()}")
    println("##################################\n")

    val calculadora = CalculadoraBonificacao()

    calculadora.registro(funcionario02)
    calculadora.registro(funcionario03)
    calculadora.registro(funcionario04)

    println("Valor Total Bonificação: ${calculadora.total}")
}