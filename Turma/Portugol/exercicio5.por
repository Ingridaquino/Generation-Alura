programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, resultado

		escreva("\nNota 01: ")
		leia(nota1)
		escreva("\nNota 02: ")
		leia(nota2)
		escreva("\nNota 03: ")
		leia(nota3)
        
        resultado = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5)
        
        escreva("\nResultado: ", resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 100; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */