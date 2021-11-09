programa
{
	
	funcao inicio()
	{
		real pesoT
		real M
		real E

		escreva("Peso em tomates comprado hoje: \n")
		leia(pesoT)

		se(pesoT > 50){
			E = pesoT - 50 
			M = E*4
			escreva("O execesso é de: "+ E + "\nE sua multa é de: " + M)
		}senao se(pesoT < 50){
			escreva("Fique calmo, não precisará pagar multa hoje")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */