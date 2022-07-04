programa
{
	
	funcao inicio()
	{	
		real soma = 0 , media
		inteiro number[15] = {2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19}

		para(inteiro x = 0; x <= 14; x++){
			escreva("\nOs números são: ", number[x])

			soma = soma + number[x]

			media = soma / 15	
		}

			escreva("\nSoma: ", soma)
			escreva("\nMedia: ", media)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */