programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], maior

		escreva("1° pontuação: ")
		leia(vetor[0])
		escreva("2° pontuação: ")
		leia(vetor[1])
		escreva("3° pontuação: ")
		leia(vetor[2])
		escreva("4° pontuação: ")
		leia(vetor[3])
		escreva("5° pontuação: ")
		leia(vetor[4])

		maior = vetor[0]	
		para(inteiro i = 0; i < 5; i++){
		  		se (vetor[i]> maior){
                     maior = vetor[i]
	}

	}
	escreva(" \n O maior numero do nosso vetor é : ", maior)
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */