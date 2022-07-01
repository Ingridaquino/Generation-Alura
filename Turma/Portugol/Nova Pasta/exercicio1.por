programa
{
	
	funcao inicio()
	{
		real salario,mediaFilhos
		real somaSalario = 0 
		real mediaSalario = 0
		real maiorSalario = 0
		real porcentagem = 0
		inteiro filhos, x
		inteiro somaFilhos = 0
		
		para(x = 0; x <= 5; x++){
			escreva("Informe o valor do salário: ")
			leia(salario)

			somaSalario = salario + somaSalario

			se(salario > maiorSalario) {
				maiorSalario = salario
			}

			se(salario <= 1000) {
				porcentagem++
			}

			escreva("Informe quantidade de filhos: ")
			leia(filhos)

			somaFilhos = filhos + somaFilhos
			
		}

			mediaFilhos = somaFilhos / x	
			porcentagem = (porcentagem * 100) / x
			mediaSalario = somaSalario / x


		escreva("\nMédia salarial: ", mediaSalario)
		escreva("\nMedia filhos: ", mediaFilhos)
		escreva("\nMaior salário: ", maiorSalario)
		escreva("\nPorcentagem de pessoas com salário menor ou igual a Mil: ", porcentagem)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */