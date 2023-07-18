package resolucaoIniciante;

/*Na matemática, um número perfeito é um número inteiro para o qual a soma 
 *de todos os seus divisores positivos próprios (excluindo ele mesmo) é 
 *igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é
 *igual a 6. Sua tarefa é escrever um programa que imprima se um 
 *determinado número é perfeito ou não.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém
um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste da entrada.
Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), 
que pode ser ou não, um número perfeito.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou 
“X nao eh perfeito”, de acordo com a especificação fornecida.
 * 
 */

import java.io.IOException;
import java.util.Scanner;

public class NumeroPerfeito_1164 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int num = 0;
		int div = 0;

		for (int i = 0; i < N; i++) {
			num = sc.nextInt();
			for (int j = 1; j < num; j++) {
				if (num % j == 0) {
					div += j;
				}
			}
			if (div == num) {
				System.out.println(num + " eh perfeito");
			} else {
				System.out.println(num + " nao eh perfeito");
			}
			div = 0;
		}
		sc.close();
	}
}