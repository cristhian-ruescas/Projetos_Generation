fun main(args: Array<String>) {

    println("Digite um numero de 1 a 10: ")
    var num = readLine()!!.toInt()

    for(i in 1..10){
        println("$num X $i = ${num * i}")

    }
    for(d in 10 downTo 1){
    println("\n$num X $d = ${d * num}")
    }
}