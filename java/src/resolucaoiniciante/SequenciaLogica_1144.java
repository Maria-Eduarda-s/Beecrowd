package resolucaoiniciante;
/*
 *Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão 
 *apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. Para 
 *valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class SequenciaLogica_1144 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i * i) + " " + (i * i * i));
			System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
		}

		sc.close();
	}
}