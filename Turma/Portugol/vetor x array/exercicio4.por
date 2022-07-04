programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro soma = 0, somaDiagonal = 0, maior = 0

		escreva("\nInforme os vlores da Matriz: \n")
		para(inteiro l = 0; l <= 2; l++) {
			para(inteiro c = 0; c <= 2; c++) {
				leia(matriz[l][c])
				soma = soma + matriz[l][c]

				se(matriz[l][c] > maior) {
					maior = matriz[l][c]
				}

				
			}
		}

		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]
		escreva("\nA soma total da matriz é: ", soma)
		escreva("\nA soma total da soma Diagonal é: ", somaDiagonal)
		escreva("\nO maior é: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */