package resolucaoiniciante;
/*Neste problema você deverá ler 15 valores colocá-los em 2 vetores 
 * conforme estes valores forem pares ou ímpares. Só que o tamanho de cada 
 * um dos dois vetores é de 5 posições. Então, cada vez que um dos dois 
 * vetores encher, você deverá imprimir todo o vetor e utilizá-lo 
 * novamente para os próximos números que forem lidos. Terminada a leitura,
 * deve-se imprimir o conteúdo que restou em cada um dos dois vetores, 
 * imprimindo primeiro os valores do vetor impar. Cada vetor pode ser 
 * preenchido tantas vezes quantas for necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.
 * 
 */

import java.io.IOException;
import java.util.Scanner;

public class PreenchimentoDeVetorIV_1179 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int[] par = new int[5];
		int[] impar = new int[5];
		int contPar = 0, contImpar = 0;

		for (int i = 0; i < 15; i++) {
			int n = sc.nextInt();

			if (n % 2 == 0) {
				par[contPar] = n;
				contPar++;
				if (par[4] == n) {
					for (int j = 0; j < par.length; j++) {
						System.out.println("par[" + j + "] = " + par[j]);
					}
					contPar = 0;
				}
			} else {
				impar[contImpar] = n;
				contImpar++;
				if (impar[4] == n) {
					for (int j = 0; j < impar.length; j++) {
						System.out.println("impar[" + j + "] = " + impar[j]);
					}
					contImpar = 0;
				}
			}
		}
		for (int i = 0; i < contImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
		}
		for (int i = 0; i < contPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
		}
		sc.close();
	}
}