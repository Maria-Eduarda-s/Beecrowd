package solucoesjava.resolucaoIniciante;

/*
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada 
 * X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou 
 * decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. 
A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem 
crescente, caso contrário imprima a mensagem “Decrescente”.
 */

import java.io.IOException;
import java.util.Scanner;

public class CrescenteEDecrescente_1113 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int X, Y;
		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != Y) {

			if (X > Y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
	
}