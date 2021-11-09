programa
{
	
	funcao inicio()
	{
  inteiro num=0, i, soma=0

  para(i = 0; i < 500; i++){
	num= num+1
 
  	se(num % 2 != 0 e num % 3 == 0){
		soma+=num
  	}
  }
  escreva("A soma é: ", soma)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */