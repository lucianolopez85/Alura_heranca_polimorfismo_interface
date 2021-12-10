import modelo.*

fun testeAutenticacao() {
    val diretor = Diretor(
        "Valter",
        "055.155.255-35",
        11000.0,
        500.0,
        1234
    )

    val gerente = Gerente(
        "Hadassa",
        "044.144.244-34",
        8000.0,
        4321
    )

    val analista = Analista(
        "Luciano",
        "033.133.233-33",
        5500.0,
        3333,
        endereco = Endereco(
            rua = "rua de baixo"
        )
    )

    val sistema = Sistema()

    val cliente = Cliente(
        "Leticia",
        "022.122.222-32",
        5555,
        endereco = Endereco(rua = "Estrada de nuvens", numero = 461, bairro = "Ingleses")
    )

    println("\n")
    if (sistema.entra(diretor, 1234)) {
        diretor.cargo()
        diretor.bonificacao()
        println("Nome: ${diretor.nome}")
        println("Salário: ${diretor.salario}")
        println("Bonificação: ${diretor.bonificacao()}")
        println("PLR: ${diretor.plr}")
        println("Total: ${diretor.total()}")
        println("##################################\n")
    } else {
        println("##################################\n")
    }

    if (sistema.entra(gerente, 4321)) {
        gerente.cargo()
        gerente.bonificacao()
        println("Nome: ${gerente.nome}")
        println("Salário: ${gerente.salario}")
        println("Bonificação: ${gerente.bonificacao()}")
        println("##################################\n")
    } else {
        println("##################################\n")
    }

    if (sistema.entra(analista, 3333)) {
        analista.cargo()
        analista.bonificacao()
        println("Nome: ${analista.nome}")
        println("Salário: ${analista.salario}")
        println("Bonificação: ${analista.bonificacao()}")
        println("Endereço: \n${analista.endereco.rua}")
        println("##################################\n")
    } else {
        println("##################################\n")
    }

    if (sistema.entra(cliente, 5555)) {
        println("Nome: ${cliente.nome}")
        println(
            "Endereço: " +
                    "\nrua ${cliente.endereco.rua}, n° " +
                    "${cliente.endereco.numero}, Bairro " +
                    "${cliente.endereco.bairro}"
        )
    }
}