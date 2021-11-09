/*
Exercício

1. Crie um projeto chamado cadastroDeConvidados
2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura, para simular um menu de escolhas:]
- O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim", a partir do momento que o usuário digitar "Não" ou qualquer outra coisa, o programa precisa ser finalizado.
- Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
- Se o usuário escolher 2, abre as instruções para remover um convidado
- Se o usuário escolher 3, lista os convidados
3. Use a List para cadastrar cada convidado
4. Teste para ver se tudo funciona
 */
fun main(args: Array<String>) {

    var simNao = "S" // variavel para parar o while
    val convidados = mutableMapOf(   // A lista, escolhi map para poder ver a posição do convidado para que não haja confusão nos nomes duplos
        1 to "Kakashi",
    )

    while (simNao == "S" || simNao == "s" ) {  // laço de repetição para que possa adicionar ou remover varias vezes
        println("Escolha dentre as opções:  1° adiciona um novo convidade - 2° remover um convidade - 3°listar convidados") //pedir opção
        var opcao = readLine()!!.toInt() //ler ela
        when (opcao) {      // when para escolher opçoes
            1 -> adicionar(convidados)
            2 -> remover(convidados)
            3 -> listar(convidados)
        }
        println("Deseja continuar? Se sim, digite (S) ou (N) para sair. R:") // Para pedir se quer sair
        simNao = readLine()!!

        if (simNao == "S"){ // para atribuir valor S para continuar
            simNao = "S"
    }else if(simNao == "N" || simNao == "n" ){ // para atribuir valor n para sair
            simNao = "N"
        println(" Obrigado por participar do Beta \uD83D\uDC96" + "\n Para ver novas atualizações confiram o link: https://github.com/cristhian-ruescas/29_10  \uD83D\uDE80")
        }
    }

    }






fun adicionar(convidados: MutableMap<Int, String>){ // função que adiciona
    println("Fale a posição na lista: ")
    val posicao = readLine()!!.toInt()
    println("Nome da pessoa: ")
    val nome = readLine()!!

    convidados.put(posicao, nome)
}
fun remover(convidados: MutableMap<Int, String>){ // função que remove
    println("Fale quem você quer tirar: ")
    var tirar = readLine()!!.toInt()

    convidados.remove(tirar)
}
fun listar(convidados: MutableMap<Int, String>){
    println(convidados)
}


