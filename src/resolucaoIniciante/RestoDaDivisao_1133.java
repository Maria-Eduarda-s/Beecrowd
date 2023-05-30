package resolucaoIniciante;

/*
 *Escreva um programa que leia 2 valores X e Y e que imprima todos os valores 
 *entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não 
necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RestoDaDivisao_1133 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int maior = Math.max(X, Y);
		int menor = Math.min(X, Y);
		menor++;

		while (menor < maior) {

			if (menor % 5 == 2 || menor % 5 == 3) {
				numeros.add(menor);
			}
			menor++;
		}
		Collections.sort(numeros);

		for (int numero : numeros) {
			System.out.println(numero);
		}

		sc.close();
	}
}