fun main(args: Array<String>) {

    // precisei ficar off 16h as 17h então irei mandar o quanto fiz e dps irei atualizar
    var soma =0
    var media = 0
    var i = 0
    var maior = 0
    var menor = 0

    do{
        print("Digite um numero: ")
        var num = readLine()!!.toInt()

        soma += num


        if(i == 0){
            menor = num
            maior = num
        }

        if(num > maior && num!=0 ) {
            maior = num
        }else if(menor > num && num != 0) {
            menor = num
        }
        i++
    }
        while (num != 0)

    var tirando = i - 1
    media = soma / tirando
    println("A soma é $soma")
    println("A media é $media")
    println("O maior é $maior")
    println("O menor é $menor")

}



