package resolucaoiniciante;
/*
 *Você deve fazer um programa que apresente a sequencia conforme o exemplo 
 *abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13
 */

import java.io.IOException;

public class SequenciaIJ3_1097 {
	
	public static void main(String[] args) throws IOException {

		int J = 7;
		for (int I = 1; I <= 9; I += 2) {
		        System.out.println("I=" + I + " J=" + J);
		        System.out.println("I=" + I + " J=" + (J - 1));
		        System.out.println("I=" + I + " J=" + (J -2));
				J = J + 2;
		}
	}
}