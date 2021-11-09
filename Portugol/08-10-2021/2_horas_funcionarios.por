programa
{
	
	funcao inicio()
	{
		cadeia funcionario
		real horas
		real salario
		real E
		

		escreva("Qual é o nome do funcionario? \n")
		leia(funcionario)
		escreva("Horas trabalhadas \n")
		leia(horas)

		se(horas > 50){
			E = horas - 50
			salario = 20.00*E + 500
			escreva(" O funcionario : ", funcionario, "\nTem de excesso: ", E, "\nPortanto terá como salario: ", salario)
		}senao se(horas < 50){
			salario = horas * 10.00
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */