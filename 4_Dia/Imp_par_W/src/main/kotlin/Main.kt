fun main(args: Array<String>) {
    var cont = 0
    var impar = 0
    var par = 0

    while(cont < 10){
        print("Digite os numeros que deseja: ")
        var num = readLine()!!.toInt()
        cont++

        if(num % 2 === 0){
            par++
        }else{
            impar++
        }
    }
    println("São $par pares")
    println("São $impar impares")
}