fun main(args: Array<String>) {

    var valvenda = 0.0

println("Valor da venda: ")
    valvenda = readLine()!!.toDouble()



    if(valvenda >= 10000){
        var porc = (valvenda * 30)/ 100
        println("Terá 30% de comissão, pagando " + porc + "$")
    }else if (valvenda >= 5000 && valvenda < 10000){
        var porc = (valvenda * 20)/100
        println("Terá 20% de comissão, pagando " + porc + "$")
    }else if (valvenda >= 1000 && valvenda < 5000){
        var porc = (valvenda * 10)/100
        println("Terá 10% de comissão, pagando " + porc + "$")
    }else if (valvenda >= 1 && valvenda < 1000){
        println("N / D")
    }else{
        print("invalido")
    }
    }
