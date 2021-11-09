programa
{
	
	funcao inicio()
	{
	
		real I

		escreva("Qual o indice atualmente: ")
		leia(I)

	     
		se(I >= 0.30 e I < 0.40){
			escreva("O primeiro grupo suspendi as atividade")
		}senao se(I >= 0.4 e I < 0.5){
			escreva("O segundo grupo suspendi as atividade")
		}senao se(I >= 0.5){
			escreva("todas as empresas suspendi as atividades")
		}senao{
			escreva("Nenhuma tera que suspender a atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */