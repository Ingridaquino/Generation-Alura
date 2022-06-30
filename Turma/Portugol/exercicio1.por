programa
{
	inclua biblioteca Matematica
	
	funcao inicio()

		//Exercicio 1
	{
		inteiro idade, mes, dias, calc

		escreva("Digite sua idade: ")
		leia(idade)
		
		escreva("Quantos meses: ")
		leia(mes)

		escreva("Quantos dias: ")
		leia(dias)
		limpa()

		calc = (idade * 365) + (mes * 30) + dias

		

		escreva("O total de dias é: " + calc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */