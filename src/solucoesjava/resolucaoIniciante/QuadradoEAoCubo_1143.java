package solucoesjava.resolucaoIniciante;

import java.io.IOException;
import java.util.Scanner;

/*
 *Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a 
 *quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
 */

public class QuadradoEAoCubo_1143 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i = 1;

		while (N >= i) {
			int a = i * i;
			int b = i * i * i;
			System.out.println(i + " " + a + " " + b);
			i++;
		}

		sc.close();
	}
}