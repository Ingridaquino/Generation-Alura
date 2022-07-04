programa
{
	
	funcao inicio()
	{
		real notas[2][2]
		real soma = 0.0

		escreva("Digite às notas do Aluno: \n")
		para(inteiro l = 0; l <= 1; l++) {
			para(inteiro c = 0; c <= 1; c++)
			leia(notas[l][c])
			soma = soma + notas[l][c]
			
			
		}

		escreva("\n", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */