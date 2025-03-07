package resolucaoiniciante;
/*Faça um programa que leia um valor e apresente o número de Fibonacci 
 * correspondente a este valor lido. Lembre que os 2 primeiros elementos 
 * da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 
 * anteriores a ele. Todos os valores de Fibonacci calculados neste 
 * problema devem caber em um inteiro de 64 bits sem sinal.

Entrada
A primeira linha da entrada contém um inteiro T, indicando o número de 
casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60),
correspondente ao N-esimo termo da série de Fibonacci.

Saída
Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde 
X é o N-ésimo termo da série de Fibonacci.
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class FibonacciEmVetor_1176 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		long[] fibonacci = new long[T + 2];

		for (int j = 0; j < fibonacci.length; j++) {
			if (j < 2) {
				fibonacci[j] = j;
			} else {
				fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
			}
		}
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			System.out.println("Fib(" + N + ") = " + fibonacci[N]);
		}
		sc.close();
	}
}