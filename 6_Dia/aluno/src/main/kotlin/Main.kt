import cursos.cursos

fun main(args: Array<String>) {

    val rosnei = Student("Rosnei"," Da Silva", 123, 50.0, 2)
    val maria = Student("maria"," Da Silva", 1234, 80.0, 1)
    val henrique = Student("Henrique"," Da Silva", 12345, 10.0, 3)
    val rebeca = Student("Rosnei"," Da Silva", 123456, 70.0, 1)


    rosnei.nomeCompleto()
    rosnei.mudarano()

    val cursoIngles = cursos("Ingês", "Genivaldo",1)

    cursoIngles.cadastrar(rosnei)
    cursoIngles.cadastrar(maria)

    cursoIngles.numEstudante()

    cursoIngles.unEnroll(rebeca)

    val estudantes: Array<Student?> = arrayOf(henrique, rebeca)
    cursoIngles.cadastrar(estudantes)
    cursoIngles.numEstudante()
    cursoIngles.bestGrade()

    try{
        cursoIngles.verificaraluno(maria)
    }catch (e:Exception){
        println(e.message)
    }
}