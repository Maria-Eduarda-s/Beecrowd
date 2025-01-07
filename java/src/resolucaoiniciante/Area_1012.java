package resolucaoiniciante;
/*
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: 
 * A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde 
a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço 
entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 
dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Area_1012 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();

		System.out.printf("TRIANGULO: %.3f%n", (A * C / 2));
		System.out.printf("CIRCULO: %.3f%n", (3.14159 * (C * C)));
		System.out.printf("TRAPEZIO: %.3f%n", ((A + B) * C / 2));
		System.out.printf("QUADRADO: %.3f%n", (B * B));
		System.out.printf("RETANGULO: %.3f%n", (A * B));

		sc.close();
	}
}