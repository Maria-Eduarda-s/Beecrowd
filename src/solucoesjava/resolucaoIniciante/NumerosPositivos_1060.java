package solucoesjava.resolucaoIniciante;

/*
 * Faça um programa que leia 6 valores. Estes valores serão somente negativos 
 * ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade 
 * de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.io.IOException;
import java.util.Scanner;

public class NumerosPositivos_1060 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int positivos = 0;
		for (int i = 1; i <= 6; i++) {
			Double valor = sc.nextDouble();

			if (valor > 0)
				positivos++;
		}
		System.out.println(positivos + " valores positivos");
		sc.close();
	}
}