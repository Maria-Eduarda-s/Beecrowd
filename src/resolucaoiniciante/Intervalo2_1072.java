package resolucaoiniciante;

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em 
 * seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do 
intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos 
de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) 
do intervalo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Intervalo2_1072 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i = 0, j = 0, k = 0, X;

		while (N > i) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				j++;
			} else {
				k++;
			}
			i++;
		}
		System.out.println(j + " in");
		System.out.println(k + " out");

		sc.close();
	}
}
