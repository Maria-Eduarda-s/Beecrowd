package resolucaoIniciante;

/*
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de 
 * Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente
 * “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 
dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.
 */

import java.io.IOException;
import java.util.Scanner;

public class FormulaDeBhaskara_1036 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		Double delta, x1, x2;

		delta = Math.pow(B, 2) - 4 * A * C;
		x1 = (-B + Math.sqrt(delta)) / (2 * A);
		x2 = (-B - Math.sqrt(delta)) / (2 * A);

		if (A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f%n", x2);
		}
		sc.close();
	}
}