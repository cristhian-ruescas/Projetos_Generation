fun main(args: Array<String>) {


    var ingresso = 18.0
    var idade = 0
    var est : String

    println("Qual seria a idade: ")
    idade = readLine()!!.toInt()

    println("É estudante? Diga sim ou não")
    est = readLine()!!

    println("Comprou quantos ingressos?: ")
    var quant = readLine()!!.toInt()

    if(idade >= 0 && idade <= 5){
        println("O desconto será de 60%, sendo assim: 7,20 reais")
    }else if(idade > 5 && idade < 60 && quant == 1  && est == "não" || est == "Não"){
        println("O valor do ingresso será de: 18 reais, pagando inteiro.")
    }else if(idade > 5 && idade < 60 && quant == 1  && est =="sim" || est == "Sim"){
        println("O valor do ingresso sera de 9 reais, pagando meia. ")
    }else if(idade >= 60){
        println(" O valor será de 8,1 reais, com 55% de desconto")
    }else if(idade > 5 && idade < 60 && quant >= 2){
        println("O valor será de 12,6, com 30% de desconto pela segunda compra.")
    }
    else{
        println("Idade invalida")
    }


}