package resolucaoiniciante;
/*
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Tabuada_1078 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + N + " = " + N * i);
		}

		sc.close();
	}
}
