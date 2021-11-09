fun main(args: Array<String>) {

        val maria = repvendas(
                "Maria", "da Silva", 465, 20, 15, 30,
                2500.0, 5, 3
        )

        val vlad = repvendas(
                "Vlad", "felipe", 500, 20, 16, 50,
                3000.0, 5, 500
        )

        val keitlon = gerenteVendas(
                "kleiton", "alek", 600, 50, 60, 40,
                600.00, 8)


        println("****INFORMAÇÃO MARIA***")
        println(maria.tempoAtApos())
        println(maria.tempoAtFmFerias())
        println(maria.calculate())
        println(maria.calcularbonus())

}

