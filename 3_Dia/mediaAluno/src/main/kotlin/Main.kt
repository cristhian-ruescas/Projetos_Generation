fun main(args: Array<String>) {
    var primb = 0.0
    var segb = 0.0
    var terb = 0.0
    var quartb = 0.0

    print("Digite o primeiro bimestre: ")
    primb = readLine()!!.toDouble()
    print("Digite o segundo bimestre: ")
    segb = readLine()!!.toDouble()
    print("Digite o terceiro bimestre: ")
    terb = readLine()!!.toDouble()
    print("Digite o quarto bimestre: ")
    quartb = readLine()!!.toDouble()

    val media = (primb+segb+terb+quartb)/4
    println("A media é: "+ media)
    if( media >= 0.0 && media < 4.0){
        println("Reprovado")
    }else if( media >= 4.0 && media <=5.0 ){
        println("Regular")
    }else if(media > 5.0 && media <= 8.0) {
        println("Boa")
    }else if(media > 8.0 && media <= 10.0){
        println("Excelente")
    }else{
        println("Numero invalido")
    }
}