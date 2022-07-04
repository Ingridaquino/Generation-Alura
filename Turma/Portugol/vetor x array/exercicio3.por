programa
{
	
	funcao inicio()
	{
		inteiro N1[4][4] = {{2, 5, 6, 4},
						{7, 6, 9, 10},
						{9, 6, 66, 20},
						{25, 6, 3, 98}}

		inteiro N2[4][4] = {{5, 6, 15, 4},
						{52, 6, 9, 10},
						{9, 22, 6, 20},
						{25, 6, 3, 20}}


			inteiro M1[4][4]
			inteiro M2[4][4]


	para(inteiro i = 0; i <= 3; i++) {
		para(inteiro c = 0; c <= 3; c++){		

		M1[i][c] = N1[i][c] + N2[i][c]
		M2[i][c] = N1[i][c] + N2[i][c]

			
		escreva("\n ", M1[i][i])
		escreva("\n ", M2[i][c])
		}

	}							
	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */