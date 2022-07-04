programa{
	inclua biblioteca Util -->u
	
	funcao inicio()
	{
	  real media = 0.0
	  inteiro dado[5]
	  inteiro Qtdmaior = 0, atualNum = 0
	  
		//Para do sorteio
	  para(inteiro x = 0; x <= 4; x++){
	  	dado[x] = u.sorteia(1,100)
	  	escreva("\n", dado[x])
	  	media = media + dado[x]

	  	se(dado[x] > atualNum) {
	  		Qtdmaior = 1
	  		atualNum = dado[x]
	  	}senao se(dado[x] == atualNum) {
	  		Qtdmaior++
	  	}
	  }

	  
		// media
		escreva("\n Media ", media/5)
		escreva("\nMaior número: ", atualNum)
		escreva("\n Quantidade: ", Qtdmaior)
	  

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */