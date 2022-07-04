programa
{
	
	funcao inicio()
	{
		inteiro notas[3][3] = {{10, 20, 30}, 
							{1, 2, 5},
							{5, 6, 4}}

	//antes de ir para próxima linhas, primeiro precisa percorrer todas as colunas da primeira linha.

		para(inteiro l = 0; l <= 2; l++){ // Linhas[0]
			para(inteiro c = 0; c <= 2; c++){// Colunas[0]	
				escreva(notas[l][c], "|")
			}

			escreva("\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */