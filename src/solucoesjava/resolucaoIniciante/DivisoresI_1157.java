package solucoesjava.resolucaoIniciante;

/*
 *Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class DivisoresI_1157 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int calculo = 0;

		for (int i = 1; i <= N; i++) {
			calculo = N % i;
			if (calculo == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}