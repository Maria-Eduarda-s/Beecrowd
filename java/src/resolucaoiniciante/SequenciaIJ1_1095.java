package resolucaoiniciante;
/*
 *Você deve fazer um programa que apresente a sequencia conforme o exemplo 
abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
 */

import java.io.IOException;

public class SequenciaIJ1_1095 {

	public static void main(String[] args) throws IOException {

		int i = 1, j = 60;
		System.out.println("I=" + i + " J=" + j);

		while (j != 0) {
			System.out.println("I=" + (i += 3) + " J=" + (j -= 5));
		}
	}
}