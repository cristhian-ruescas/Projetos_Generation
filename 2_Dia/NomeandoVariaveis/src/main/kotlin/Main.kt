fun main(args: Array<String>) {


    var nome = ""
    var idade = 0
    var prefE = ""
    var nac = ""
    var tps = ""

    print("Digite seu nome: ")
    nome = readLine()!!
    print("Digite a sua idade: ")
    idade = readLine()!!.toInt()
    print("Digite sua preferencia de emprego: ")
    prefE = readLine()!!
    print("Nacionalidade: ")
    nac = readLine()!!
    print("Qual seu tipo sanguinio?")
    tps = readLine()!!

    var data = 2021 - idade

    println("\nO nome é $nome" + "\nA idade é: $idade" + " \nPreferencia de emprego: $prefE" + " \nNacionalidade: $nac" +
            " \nTipo sanguinio: $tps" + "\nE nasceu em: $data")
}