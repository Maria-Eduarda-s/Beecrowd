package resolucaoiniciante;

/*
 *A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como 
 *série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros,
 * é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um 
 * inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em 
branco. Não deve haver espaço após o último valor.
 */

import java.io.IOException;
import java.util.Scanner;

public class FibonacciFacil_1151 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i = 0;
		int j = 1;
		int k = 2;

		System.out.print(i);
		if (N > 1) {
			System.out.print(" " + j);
		}

		while (k < N) {
			int sequencia = i + j;
			System.out.print(" " + sequencia);
			i = j;
			j = sequencia;
			k++;
		}
		sc.close();
		System.out.println();
	}
}