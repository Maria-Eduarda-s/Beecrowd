package resolucaoiniciante;

/*
 *Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão 
 *resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class Resto2_1075 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int i = 1, j = 10000;
		int N = sc.nextInt();

		while (i < j) {
			if (i % N == 2) {
				System.out.println(i);
			} else {
			}
			i++;
		}
		sc.close();
	}
}
