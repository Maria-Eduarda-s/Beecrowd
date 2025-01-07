package solucoesjava.resolucaoIniciante;

/*
 *Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência
 *de 1 até Y, passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e 
(X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco 
entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco 
após o último valor da linha.
1 2 3
4 5 6
7 8 9
10 11 12
...
97 98 99
 */

import java.io.IOException;
import java.util.Scanner;

public class SequenciaLogica2_1145 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int a = 1;

		while (a < Y) {
			for (int j = 0; j < X; j++) {
				System.out.print(a);
				if (j < X - 1) {
					System.out.print(" ");
				} 
				a++;
			}
			System.out.println();
		}
		sc.close();
	}
}
