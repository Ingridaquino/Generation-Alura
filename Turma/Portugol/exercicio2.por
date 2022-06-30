programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, totalDias, idadeDia

		escreva("Digite sua idade em dias: ")
		leia(totalDias)
		limpa()

		//Convertendo dias em anos
		anos = totalDias / 365


		//Convertendo dias em meses
		meses = (totalDias % 365) / 30

		idadeDia = (totalDias % 365) / 30

		

		escreva("\nSua idade é: " + anos + " anos " + meses + " meses " + idadeDia + " dias")
		
		
	}
}   
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */