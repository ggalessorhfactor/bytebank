fun testaFuncionarios() {
    val guilherme = Analista(
        nome = "Guilherme",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${guilherme.nome}")
    println("cpf ${guilherme.cpf}")
    println("salario ${guilherme.salario}")
    println("bonificação ${guilherme.bonificacao()}\n")

    val natasha = Gerente(
        nome = "Natasha",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${natasha.nome}")
    println("cpf ${natasha.cpf}")
    println("salario ${natasha.salario}")
    println("bonificação ${natasha.bonificacao()}")

    if (natasha.autentica(1234)) {
        println("autenticou com sucesso\n")
    } else {
        println("acesso negado\n")
    }

    val joao = Diretor(
        nome = "João",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${joao.nome}")
    println("cpf ${joao.cpf}")
    println("salario ${joao.salario}")
    println("bonificação ${joao.bonificacao()}")
    println("plr ${joao.plr}")

    if (joao.autentica(4000)) {
        println("autenticou com sucesso\n")
    } else {
        println("acesso negado\n")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(guilherme)
    calculadora.registra(natasha)
    calculadora.registra(joao)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}