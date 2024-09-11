package resolucaoiniciante;

/*
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 
 * valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class MaiorEPosicao_1080 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int i = 0, j = 100;
		int[] valores = new int[100];

		while (i < j) {
			int N = sc.nextInt();
			valores[i] = N;
			i++;
		}

		i = 1;
		j = 0;
		int maior = valores[0];
		while (i < valores.length) {
			if (valores[i] > maior) {
				maior = valores[i];
				j = i;
			}
			i++;
		}

		System.out.println(maior);
		System.out.println(j + 1);
		sc.close();
	}
}
