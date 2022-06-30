programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		inteiro a, b, c
		real d, r, s
		
		

		escreva("Digite um número: ")
		leia(a)

		escreva("Digite outro número: ")
		leia(b)

		escreva("Digite mais um número:")
		leia(c)
		limpa()

		r = Matematica.potencia(a, 2) + Matematica.potencia(b, 2)
		s = Matematica.potencia(b, 2) + Matematica.potencia(c, 2)

		d = r + s / 2

		escreva(" O valor de D é: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */