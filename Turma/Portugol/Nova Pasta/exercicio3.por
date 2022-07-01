programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		inteiro media = 0
		inteiro lidos = 0
		inteiro valor = 0

		enquanto(valor >= 0) {
			escreva("Informe um valor : ")
			leia(valor)

			se(valor > 0) {
				soma = soma + valor
				lidos++
			}
		}

		media = soma / lidos

		escreva("\nMédia: ", media)
		escreva("\nSoma: ", soma)
		escreva("\nLidos: ", lidos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */