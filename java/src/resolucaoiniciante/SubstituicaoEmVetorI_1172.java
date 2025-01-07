package resolucaoiniciante;
/*
 *Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os 
 *valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do 
vetor e x é o valor armazenado naquela posição.
 */

import java.io.IOException;
import java.util.Scanner;

public class SubstituicaoEmVetorI_1172 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int[] x = new int[10];

		for (int i = 0; i < x.length; i++) {
			int num = sc.nextInt();
			if (num >= 1) {
				x[i] = num;
			} else {
				x[i] = 1;
			}
			System.out.println("X[" + i + "] = " + x[i]);
		}
		sc.close();
	}
}