programa {
	
	funcao inicio() {

		real notas[5]
		real soma = 0.0
		

		para(inteiro x = 0; x <= 4 ; x++) {
			leia(notas[x])

			soma = soma + notas[x]
		}

			se(soma > 50){
				escreva("\nA SOMA É MAIOR QUE 50: ", soma)
			} senao {
				escreva("\nA soma foi: ", soma)
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x, 9, 15, 1}-{notas, 5, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */