programa
{
	
	funcao inicio()
	{
		real sal=0.0, somaS=0.0, mediaS=0.0, mediaF=0.0, maiorS=0.0, sal100=0.0, somaF=0.0, cont100=0.0
		inteiro numF=0, pessoas = 20

		para(inteiro i = 0; i < pessoas; i++){
		limpa()
		
		escreva("Salario do entrevistado: ")
		leia(sal)
		escreva("Qual seria o numero de filhos: ")
		leia(numF)

		somaS += sal
		somaF += numF
}
		se(sal > maiorS){
		  maiorS = sal
		}
		se(sal <= 100){
			cont100++
		}
		mediaS = somaS / pessoas
		mediaF = somaF / pessoas
		sal100 = (cont100 / pessoas)

		escreva("\n \nA media de salario dos entrevistados é: ", mediaS)
		escreva("\nA media de numeros de filhos é : ", mediaF)
		escreva("\nO maior salario é: ", maiorS)
		escreva("\nO percentual de pessoas com salário até R$100,00, é: ", sal100 * 100, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */