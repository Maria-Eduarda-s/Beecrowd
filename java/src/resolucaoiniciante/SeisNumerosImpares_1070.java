package resolucaoiniciante;
/*
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir 
 * de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
 */

import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares_1070 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int X = sc.nextInt();

		while (6 > i) {
			if (X % 2 != 0) {
				System.out.println(X);
				i++;
			} else {
			}
			X++;
		}
		sc.close();
	}
}