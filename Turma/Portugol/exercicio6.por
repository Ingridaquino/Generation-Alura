programa
{
	inclua biblioteca Matematica-->m
	
	
	funcao inicio()
	{
		inteiro x1, x2, y1, y2, d

		escreva("Digite um número: ")
		leia(x1)

		escreva("Digite um número: ")
		leia(x2)

		escreva("Digite um número: ")
		leia(y1)

		escreva("Digite um número: ")
		leia(y2)

		d = (m.potencia(x2, 2) - m.potencia(x1, 2)) + (m.potencia(y2, 2) - m.potencia(y1, 2))
		
		escreva("O calculo é : ", d )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */