programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Qual a idade do nadador? ")
		leia(idade)

		se(idade < 5){
			escreva("Idade insuficiente")
		}senao se( idade >= 5 e idade <= 7){
			escreva("A idade: ", idade, " se encaixa como Infantil A")
		}senao se(idade >= 8 e  idade <= 11){
			escreva("A idade: ", idade, " se encaixa como Infantil B")
		}senao se(idade >= 12 e idade <= 13){
			escreva("A idade: ", idade, " se encaixa como Juvenil A")
		}senao se(idade >= 14 e idade <= 17){
			escreva("A idade: ", idade, " se encaixa como Juvenil B")
				}senao{
					escreva("A idade: ", idade, " se encaixa como Adulta")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */