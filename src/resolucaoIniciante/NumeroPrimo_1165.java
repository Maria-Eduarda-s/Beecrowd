package resolucaoIniciante;

/*Na matemática, um Número Primo é aquele que pode ser dividido somente 
 * por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode 
 * ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém
um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada.
Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), 
que pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X 
nao eh primo”, de acordo com a especificação fornecida.
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class NumeroPrimo_1165 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			int div = 0;

			if (num <= 1) {
				System.out.println(num + " nao eh primo");
			} else {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						div++;
						break;
					}
				}
				
				if (div == 0) {
					System.out.println(num + " eh primo");
				} else {
					System.out.println(num + " nao eh primo");
				}
			}
		}
		sc.close();
	}
}