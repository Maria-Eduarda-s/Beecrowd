package resolucaoiniciante;
/*
 *System of a Download é uma famosa banda de Hacker Metal! Certa vez,
 * eles criaram um dispositivo, com seis botões, numerados de 0 a 5, e colocaram 
 * nesse dispositivo os seus 11 maiores sucessos. Para tocar uma destas músicas,
 * é preciso pressionar dois botões. Com isso, os números destes dois botões são 
 * somados, e então toca-se a música correspondente ao número da soma, conforme a 
 * relação abaixo:

0 - PROXYCITY
1 - P.Y.N.G.
2 - DNSUEY!
3 - SERVERS
4 - HOST!
5 - CRIPTONIZE
6 - OFFLINE DAY
7 - SALT
8 - ANSWER!
9 - RAR?
10 - WIFI ANTENNAS

Por exemplo, se os botões pressionados forem 3 e 4, irá tocar a música 7 - SALT
Escreva um programa que, dados os dois botões que forem pressionados, determine 
qual música irá tocar.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. 
Cada caso tem dois valores inteiros, X e Y, representando quais botões foram 
pressionados.

Saída
Para cada caso de teste, imprima o nome da música correspondente.
 */

import java.io.IOException;
import java.util.Scanner;

public class SystemOfADownload_2582 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		while (C > 0) {

			int X = sc.nextInt();
			int Y = sc.nextInt();
			int escolha = X + Y;

			String[] musicas = { "PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE",
					"OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};

			System.out.println(musicas[escolha]);

			C--;
		}

		sc.close();
	}
}
