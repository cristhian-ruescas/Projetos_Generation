/* Exercício 1

1 - Criem um novo projeto que se chama Calculadora
2 - Implemente uma função para cada operação aritmética

- Adição
- Subtração
- Multiplicação
- Divisão

3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.
*/
import kotlin.math.pow

fun main(args: Array<String>) {
    // Declarando variaveis de numero e da opção, para que fique mais facil coloquei Int para escolha
    var opcao = 0
    var num1 = 0
    var num2 = 0
    var num1p = 0.0
    var num2p = 0.0

    // Dando um input para que digite o calculo que deseja.
    println("Digite qual opção deseja: 1 - Adição  2- Subtração 3- multiplicação 4- Divisão 5- potencia")
     opcao = readLine()!!.toInt()

    // if feito para o 5 já que o 5 está em Double, então preciso usar outra variavel.
     if(opcao == 5){
         println("Digite o primeiro numero: ")
         num1p = readLine()!!.toDouble()

         println("Digite o segundo numero: ")
         num2p = readLine()!!.toDouble()
     }else if(opcao >= 1 && opcao <= 4){
    println("Digite o primeiro numero: ")  //Dizendo que se não for 5, ok então é uma Int.
    num1 = readLine()!!.toInt()

    println("Digite o segundo numero: ")
    num2 = readLine()!!.toInt()
     }else{                                  // se não for de 1 a 5, numero invalido
         println("Numero invalido.")
     }


   if(opcao == 1){          // se for 1 vai fazer adição
       adicao(num1,num2)

       }else if(opcao == 2){  // se for 2 vai fazer subtração
           sub(num1,num2)
       }else if(opcao == 3){  // se for 3 multiplicação
           mult(num1,num2)
   }else if(opcao == 4){     // se for 4 divisão
       div(num1,num2)
   }else if(opcao == 5){   // se for 5 puxa outra função que é especialmente para doubles para calcular potencia
       pote(num1p, num2p)
   }
}


fun adicao(num1: Int, num2: Int) {     // funções de cada opção
    val result = num1 + num2
    print("O resultado é : $result")
}
fun sub(num1: Int, num2: Int) {
    val result = num1 - num2
    print("O resultado é: $result")
}
fun mult(num1: Int,num2: Int){
    val result = num1 * num2
    print("O resultado é: $result")
}
fun div(num1: Int,num2: Int){
    val result = num1 / num2
    print("O resultado é: $result")
}
fun pote(num1p: Double, num2p: Double) {
    val result = num1p.pow(num2p)
    print("O resultado é: $result")
}







