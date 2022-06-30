programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		
		inteiro nota1, nota2, nota3, media 

		escreva("Digite uma nota: ")
		leia(nota1)

		escreva("Digite uma nota: ")
		leia(nota2)

		escreva("Digite uma nota: ")
		leia(nota3)

		media = (nota1 + nota2 + nota3) / 3

		se(media >= 7){
			escreva("Aprovado")
		}senao se(media >= 3 e media < 6) {
			escreva("Recuperação")
		}senao {
			escreva("Reprovado")
		}
			escreva("\nSua média final é: " + media)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */