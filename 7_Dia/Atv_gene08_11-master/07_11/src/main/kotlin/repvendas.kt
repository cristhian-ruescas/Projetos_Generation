class repvendas( nome : String,  sobrenome :String,  registro : Int, idade : Int,
 diasTrabalhados: Int,  diasFerias: Int,  salario: Double,  anosTrab: Int, var vendas : Int) : funcionarios(

    nome ,  sobrenome,  registro , idade ,
    diasTrabalhados,  diasFerias,  salario,  anosTrab){

     fun calculate():Double{
         return 0.1 *vendas
     }
}