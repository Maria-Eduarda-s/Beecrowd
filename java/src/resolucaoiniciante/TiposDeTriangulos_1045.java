package resolucaoiniciante;
/*
 *Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o 
 *lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três 
 *lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão 
A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulos_1045 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double[] num = new Double[3];

		num[0] = sc.nextDouble();
		num[1] = sc.nextDouble();
		num[2] = sc.nextDouble();

		Arrays.sort(num);
		Double ordenar = num[0];
		num[0] = num[2];
		num[2] = ordenar;

		if (num[0] >= num[1] + num[2]) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if (num[0] * num[0] == num[1] * num[1] + num[2] * num[2]) {
			System.out.println("TRIANGULO RETANGULO");
		} else if (num[0] * num[0] > num[1] * num[1] + num[2] * num[2]) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if (num[0] * num[0] < num[1] * num[1] + num[2] * num[2]) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		if (Double.valueOf(num[0]).equals(Double.valueOf(num[1]))
				&& Double.valueOf(num[1]).equals(Double.valueOf(num[2]))) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (Double.valueOf(num[0]).equals(Double.valueOf(num[1]))
				|| Double.valueOf(num[1]).equals(Double.valueOf(num[2]))
				|| Double.valueOf(num[0]).equals(Double.valueOf(num[2]))) {
			System.out.println("TRIANGULO ISOSCELES");
		} else {
		}

		sc.close();
	}
}
