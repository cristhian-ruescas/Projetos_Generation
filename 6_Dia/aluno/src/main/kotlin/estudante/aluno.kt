class Student (var nome: String?,
               var sobrenome: String?,
               var registro : Int){

    var nota = 0.0
    var ano = 0

        constructor(nome: String?, sobrenome: String?,registro: Int, nota: Double) : this(nome,sobrenome,registro){
            this.nota = nota
        }
    constructor(nome: String?,sobrenome: String?,registro: Int, nota: Double, ano: Int) : this(nome, sobrenome,registro,nota){
            this.ano = ano
    }


    fun nomeCompleto(){
        print(nome + sobrenome)
    }
    val aprovado: Boolean
        get() {
            return nota >= 60

            }
        fun mudarano() {
            if(aprovado){
                ano+= 1
                println("\nParabens passou de ano")

            }else{
                println("\nReprovado")
            }
        }
    }












