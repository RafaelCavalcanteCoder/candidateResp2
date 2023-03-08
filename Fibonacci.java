package calculadora;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int numero, x = 0, y = 1, proximo = 0;//criando as variaveis.
		boolean found = false;

		// vê o número informado pelo usuário 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número: " );//execute o programa e posteriormente coloque o número desejado no "CONSOLE".
		numero = scanner.nextInt();
		scanner.close();

		// Calcula a sequência de Fibonacci chegando ou ultrapassando o número informado.
		while (proximo < numero) {
		proximo = x + y;
		x = y;
		y = proximo;
		}

		// Verifica se o número informado pertence à sequência de Fibonacci
		if (proximo == numero) {
		found = true;
		}

		// Exibe o resultado
		if (found) {
		System.out.println(numero + " Pertence à sequência de Fibonacci.");
		} else {
		System.out.println(numero + " Não pertence à sequência de Fibonacci.");
		}
		
	}//após verificado o numero executar novamente o JAVA.
	
}	
