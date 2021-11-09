programa
{
	
	funcao inicio()
	{
	  real base
	  real altura

	  escreva("Qual é o numero da base? \n")
	  leia(base)
	  escreva("Qual é o numero da altura? \n")
	  leia(altura)

	  se(base <= 0 e altura <=0){
	  	escreva("Numero invalido")
	  }senao se(base > 0 e altura > 0){
	  	escreva("A area do Triângulo é: ", base*altura/2)
	  }
	   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */