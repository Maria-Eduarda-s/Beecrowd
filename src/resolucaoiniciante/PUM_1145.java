package resolucaoiniciante;

/*
 *Escreva um programa que leia um valor inteiro N. Este N é a quantidade de 
 *linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class PUM_1145 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a = 1, b = 2, c = 3, i = 0;

		while (N > i) {
			System.out.println(a + " " + b + " " + c + " PUM");
			a += 4;
			b += 4;
			c += 4;
			i++;
		}
	}
}