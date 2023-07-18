package resolucaoIniciante;

/*
 *Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial 
 *de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.
 */

import java.io.IOException;
import java.util.Scanner;

public class FatorialSimples_1153 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {
			fatorial *= i;
		}
		sc.close();
		System.out.println(fatorial);
	}
}