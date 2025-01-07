package resolucaoiniciante;
/*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro 
 * elemento com o último, o segundo elemento com o penúltimo, etc., até 
 * trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do 
vetor e Y é o valor armazenado naquela posição.
 * 
 */

import java.io.IOException;
import java.util.Scanner;

public class TrocaEmVetorI_1175 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int[] N = new int[20];
		int Y = 0, k = 19;

		for (int i = 0; i < N.length; i++) {
			Y = sc.nextInt();
			N[i] = Y;
		}

		for (int j = 0; j < 10; j++) {
			Y = N[j];
			N[j] = N[k];
			N[k] = Y;
			k--;
		}
		k = 0;
		while (k < N.length) {
			System.out.println("N[" + k + "] = " + N[k]);
			k++;
		}
		sc.close();
	}
}