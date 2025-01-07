package solucoesjava.resolucaoIniciante;

/*
 *Você deve fazer um programa que apresente a sequencia conforme o exemplo 
 *abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5
 */

import java.io.IOException;

public class SequenciaIJ2_1096 {

	public static void main(String[] args) throws IOException {

		for (int I = 1; I <= 9; I += 2) {
		    for (int J = 7; J >= 5; J--) {
		        System.out.println("I=" + I + " J=" + J);
		    }
		}
	}
}