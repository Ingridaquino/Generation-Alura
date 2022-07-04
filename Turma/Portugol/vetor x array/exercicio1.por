programa
{
	
	funcao inicio()
	{	
		//Vetor
		real notas[5]
		real maior = 0

		para(inteiro i = 0; i <= 4; i++) {
			escreva("\n Informe a nota", i, ": ")
			leia(notas[i])

			se(maior <= notas[i]){
				maior = notas[i]
			}
		}

		escreva("\nMaior nota é: ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */