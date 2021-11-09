class gerenteVendas(
     nome : String,  sobrenome :String,  registro : Int, idade : Int,
     diasTrabalhados: Int,  diasFerias: Int,  salario: Double,  anosTrab: Int
) : funcionarios(
     nome,  sobrenome,  registro , idade  ,
 diasTrabalhados,  diasFerias,  salario,  anosTrab
){
    val equipeVendas = hashMapOf<Int, repvendas>()

    fun addrepvendas(repvendas: repvendas){
        equipeVendas.put(repvendas.registro, repvendas)
    }
    fun calcular(){
        var numVendas =0.0
        if(equipeVendas.isEmpty()){
            println("Não há representantes de vendas na equipe")
        }else{
            for(item in equipeVendas){
                numVendas += item.value.vendas
            }
            val comissao = 0.03 * numVendas
            println("A comissão geral, com base nas vendas realizadas pela equipe é : $comissao")
        }
    }
}