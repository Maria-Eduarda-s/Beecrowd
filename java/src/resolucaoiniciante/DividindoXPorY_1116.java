package resolucaoiniciante;
/*
 * Escreva um algoritmo que leia 2 números e imprima o resultado da divisão 
 * do primeiro pelo segundo. Caso não for possível mostre a mensagem 
 * “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de 
valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, 
ou “divisao impossivel” caso não seja possível efetuar o cálculo.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DividindoXPorY_1116 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			Double X = sc.nextDouble();
			Double Y = sc.nextDouble();
			if (Y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", X / Y);
			}
		}

		sc.close();
	}
}