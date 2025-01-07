package resolucaoiniciante;
/*
 *Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 *Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como 
altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Triangulo_1043 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();

		if ((A + B > C) && (B + C > A) && (C + A > B)) {
			Double P = A + B + C;
			System.out.printf("Perimetro = %.1f%n", P);
		} else {
			if (A + B > C) {
				Double area = ((A + B) * C) / 2;
				System.out.printf("Area = %.1f%n", area);
			}
		}
		sc.close();
	}
}