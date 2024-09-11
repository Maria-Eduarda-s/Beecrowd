package resolucaoiniciante;

/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * CODIGO | ESPECIFICAÇÃO |  PREÇO
 *   1    |Cachorro Quente| R$ 4.00
 *   2    |X-Salada       | R$ 4.50
 *   3    |X-Bacon        | R$ 5.00
 *   4    |Torrada simples| R$ 2.00
 *   5    |Refrigerante   | R$ 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à 
quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser 
pago, com 2 casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Lanche_1038 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		if (codigo == 1) {
			Double valor = 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
		} else if (codigo == 2) {
			Double valor = 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
		} else if (codigo == 3) {
			Double valor = 5.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
		} else if (codigo == 4) {
			Double valor = 2.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
		} else if (codigo == 5) {
			Double valor = 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		sc.close();
	}
}