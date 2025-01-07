package resolucaoiniciante;
/*
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em
 * anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês 
com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e 
alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testa
raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias_1020 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		int ano = entrada / 365;
		int mes = (entrada - (ano * 365)) / 30;
		int dia = (entrada - (ano * 365)) - mes * 30;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");

		sc.close();
	}
}