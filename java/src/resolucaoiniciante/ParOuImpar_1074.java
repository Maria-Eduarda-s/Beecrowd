package resolucaoiniciante;
/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 
 * Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), 
 * ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
 *  embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa 
 *  deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos 
de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as 
letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na 
mesma linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar_1074 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int valor;
		int i = 0;

		while (i < N) {
			valor = sc.nextInt();
			if (valor % 2 == 0 && valor != 0) {
				System.out.print("EVEN");
			} else if (valor == 0) {
				System.out.println("NULL");
			} else {
				System.out.print("ODD");
			}

			if (valor > 0) {
				System.out.println(" POSITIVE");
			} else if (valor < 0) {
				System.out.println(" NEGATIVE");
			}
			i++;
		}
		sc.close();
	}
}
