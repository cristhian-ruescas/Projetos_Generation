import kotlin.math.min

abstract class funcionarios(val nome : String, val sobrenome :String, val registro : Int,var idade : Int,
                   var diasTrabalhados: Int, var diasFerias: Int, var salario: Double, var anosTrab: Int){

    fun tempoAtApos(): Int{
        return min(60 - idade, 40 - anosTrab)
    }
    fun tempoAtFmFerias(): Int{
        return (diasTrabalhados / 360 ) * (30 - diasFerias)
    }
    fun calcularbonus(): Double{
        return 2.2*salario
    }
}