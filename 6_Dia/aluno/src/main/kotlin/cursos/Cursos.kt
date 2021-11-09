package cursos

import Student

class cursos( private val nomeCurso: String?,
              private var nomeProfessor: String?,
              private var ano: Int) {

             private val listaEstudantes = mutableListOf<Student?>()

    fun cadastrar(student : Student?){
        listaEstudantes.add(student)
        println("Estudante cadastrado com Sucesso")
    }
    fun cadastrar(students : Array<Student?>?){
        if(students != null){
        for(i in students) {
            listaEstudantes.add(i)
        }
        }
        println("Estudantes cadastrados com sucesso!")
    }
    fun unEnroll(student: Student?){
        if(listaEstudantes.contains(student)){
            listaEstudantes.remove(student)
            println("Estudante removido com sucesso!!!")
        }else{
            println("Esse estudante não existe")
        }

        }
    fun numEstudante() {
        println("O numero de estudante cadastrado é de: " + "${listaEstudantes.size}")
    }
        fun bestGrade(){
            var melhorNota: Double? = listaEstudantes[0]?.nota
            for(i in listaEstudantes){
                if(i?.nota!! > melhorNota!!){

                }
            }
            println("A melhor nota é desse curso é $melhorNota")
        }
    fun verificaraluno(student : Student?) {
        if(listaEstudantes.contains(student)) {
        print("Esse estudante existe!!!")
        }else{
            throw Exception("Aluno não existe na lista")
        }
        }
    }





