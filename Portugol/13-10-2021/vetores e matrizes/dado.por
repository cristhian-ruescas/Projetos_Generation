programa
{
	
	funcao inicio()
	{
	
		inteiro vetor[10], maior
		inteiro media=0.0, somaV=0.0

		escreva("1° dado: ")
		leia(vetor[0])
		escreva("2° dado: ")
		leia(vetor[1])
		escreva("3° dado: ")
		leia(vetor[2])
		escreva("4° dado: ")
		leia(vetor[3])
		escreva("5° dado: ")
		leia(vetor[4])
		escreva("6° d6ado: ")
		leia(vetor[5])
		escreva("7° dado: ")
		leia(vetor[6])
		escreva("8° dado: ")
		leia(vetor[7])
		escreva("9° dado: ")
		leia(vetor[8])
		escreva("10° dado: ")
		leia(vetor[9])
		
        
        maior = vetor[0]	
		para(inteiro i = 0; i < 10; i++){
		  		se (vetor[i]> maior){
                     maior = vetor[i]
	}
		somaV=somaV+vetor[i]
		media=somaV/10


}
escreva(" \n O maior numero do nosso vetor é : ", maior)
escreva(" \n A média é : ", media)
}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 778; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */