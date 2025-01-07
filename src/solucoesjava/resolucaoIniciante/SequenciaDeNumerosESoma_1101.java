package solucoesjava.resolucaoIniciante;

/*
 *Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores 
 *for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a 
 *soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada 
vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme
 exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class SequenciaDeNumerosESoma_1101 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int M, N;

		do {
			M = sc.nextInt();
			N = sc.nextInt();

			if (M > 0 && N > 0) {

				int menor = Math.min(M, N);
				int maior = Math.max(M, N);
				int soma = 0;
				for (int i = menor; i <= maior; i++) {
					soma += i;
					System.out.print(i + " ");
				}
				System.out.println("Sum=" + soma);
			}
		} while (M > 0 && N > 0);

		sc.close();
	}
}