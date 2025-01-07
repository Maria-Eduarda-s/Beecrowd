package solucoesjava.resolucaoIniciante;

/*
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua 
 * ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer
 *  saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de 
 *  cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter 
estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo 
de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que 
vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a 
quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de 
cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o 
percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual 
deve ser apresentado com dois dígitos após o ponto.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Experiencias_1094 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int N = sc.nextInt();
		int i = 0;
		Double percentual = 0.0;
		int totalquantia = 0, totalc = 0, totalr = 0, totals = 0;
		char C = 'C', R = 'R', S = 'S';

		while (N > i) {
			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);
			totalquantia += quantia;

			if (tipo == C) {
				totalc += quantia;
			} else if (tipo == R) {
				totalr += quantia;
			} else if (tipo == S) {
				totals += quantia;
			}
			i++;
		}
		System.out.println("Total: " + totalquantia + " cobaias");

		int[] totais = new int[] { totalc, totalr, totals };
		String[] tipoAnimal = new String[] { "coelhos", "ratos", "sapos" };
		for (int j = 0; j < totais.length; j++) {
			System.out.println("Total de " + tipoAnimal[j] + ": " + totais[j]);
		}
		for (int j = 0; j < totais.length; j++) {
			percentual = ((double) totais[j] / totalquantia) * 100.00;
			System.out.printf("Percentual de " + tipoAnimal[j] + ": %.2f %%\n", percentual);
		}
	}
}
