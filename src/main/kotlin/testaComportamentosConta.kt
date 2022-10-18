fun testaComportamentosConta() {
    val contaGuilherme = ContaCorrente(titular = "Guilherme", numero = 1000)
    contaGuilherme.deposita(200.0)

    val contaNatasha = ContaPoupanca(numero = 1001, titular = "Fran")
    contaNatasha.deposita(300.0)

    println(contaNatasha.titular)
    println(contaNatasha.numero)
    println(contaNatasha.saldo)

    println(contaGuilherme.titular)
    println(contaGuilherme.numero)
    println(contaGuilherme.saldo)

    println("depositando na conta do Guilherme")
    contaGuilherme.deposita(50.0)
    println(contaGuilherme.saldo)

    println("depositando na conta da Natasha")
    contaNatasha.deposita(70.0)
    println(contaNatasha.saldo)

    println("sacando na conta do Guilherme")
    contaGuilherme.saca(250.0)
    println(contaGuilherme.saldo)

    println("sacando na conta da Natasha")
    contaNatasha.saca(100.0)
    println(contaNatasha.saldo)

    println("saque em excesso na conta do Guilherme")
    contaGuilherme.saca(100.0)
    println(contaGuilherme.saldo)

    println("saque em excesso na conta da Natasha")
    contaNatasha.saca(500.0)
    println(contaNatasha.saldo)

    println("Transferência da conta da Natasha para o Guilherme")

    if (contaNatasha.transfere(destino = contaGuilherme, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaGuilherme.saldo)
    println(contaNatasha.saldo)
}