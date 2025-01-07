package solucoesjava.resolucaoIniciante;

/*Leia um valor X. Coloque este valor na primeira posição de um vetor 
 * N[100]. Em cada posição subsequente de N (1 até 99), coloque a metade 
 * do valor armazenado na posição anterior, conforme o exemplo abaixo. 
 * Imprima o vetor N.

Entrada
A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do 
vetor e Y é o valor armazenado naquela posição. Cada valor do vetor deve 
ser apresentado com 4 casas decimais.
 * 
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoDeVetorIII_1178 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double[] n = new double[100];

		for (int i = 0; i < n.length; i++) {
			n[i] = x;
			x = x / 2;
			System.out.printf("N[%d] = %.4f%n", i, n[i]);
		}
		sc.close();
	}
}