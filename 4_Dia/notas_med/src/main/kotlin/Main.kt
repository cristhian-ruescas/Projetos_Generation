fun main(args: Array<String>) {


    var notas = 0.0
    var media = 0.0
    var cont = 0
    var soma = 0.0

    while(cont < 4){
        println("Escreva as notas: ")
        notas = readLine()!!.toDouble()
        cont++
        soma += notas
        media = soma / 4
    }
    print("A media será : $media")
}