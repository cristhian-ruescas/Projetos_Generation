fun main(args: Array<String>) {

    val perimetro : Double
    val pi = 3.14
    var a: Double? = null


    print("Digite o diametro: ")
    val diametro : Int = readLine()!!.toInt()


    a = pi * diametro * diametro / 4
    println("A area do diametro é: " + a)

    val r = diametro/2
    perimetro = 2 * pi * r

    println("O perimetro do diametro é: " + perimetro)





}