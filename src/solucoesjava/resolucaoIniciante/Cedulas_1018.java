package solucoesjava.resolucaoIniciante;

/*
 *Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
 *(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
 *50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas 
 necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo 
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha
após cada linha, caso contrário seu programa apresentará a mensagem: 
“Presentation Error”.
 */

import java.io.IOException;
import java.util.Scanner;

public class Cedulas_1018 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int inicial = x;
		int cem = x / 100;
		x = x - (100 * cem);
		int cinquenta = x / 50;
		x = x - (50 * cinquenta);
		int vinte = x / 20;
		x = x - (20 * vinte);
		int dez = x / 10;
		x = x - (10 * dez);
		int cinco = x / 5;
		x = x - (5 * cinco);
		int dois = x / 2;
		x = x - (2 * dois);
		int um = x / 1;
		x = x - (1 * um);

		System.out.println(inicial);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");

		sc.close();
	}
}