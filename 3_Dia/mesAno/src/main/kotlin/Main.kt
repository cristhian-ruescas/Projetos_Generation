fun main(args: Array<String>) {

    println("Escreva um numero de 1 a 12, que falaremos o mês respectivo: ")
    var mes = readLine()!!.toInt()

    when(mes){
        1 -> println("Janeiro")
        2 -> println("fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")

        else -> print("Invalido")

    }
}