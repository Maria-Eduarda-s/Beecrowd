package solucoesjava.resolucaoIniciante;

/*
 * Você fica tão feliz no natal que tem vontade de gritar para todo mundo: 
 * "Feliz natal!!". Pra colocar toda essa felicidade pra fora, você montou um programa 
 * que, colocado um índice I de felicidade, seu grito de natal é mais animado.

Entrada
A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o índice de 
felicidade.

Saída
A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra
 a da frase. Uma quebra de linha é necessária após a impressão da frase.
 */

import java.io.IOException;
import java.util.Scanner;

public class FelizNataaal_2483 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int I = sc.nextInt();
		String frase = "Feliz natl!";
		String fraseFinal = frase;

		while (I > 0) {
			fraseFinal = fraseFinal.substring(0, 9) + "a" + fraseFinal.substring(9);
			I--;
		}
		System.out.println(fraseFinal);
	}
}
