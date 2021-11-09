fun main(args: Array<String>) {

   
    var par = 0
    var impar = 0

    for(i in 1..10){
        println("Digite 10 numeros: ")
         var num = readLine()!!.toInt()

        if(num % 2 === 0){
            par++
        }else{
            impar++
        }
    }
    println(par)
    println(impar)
}