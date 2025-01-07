package resolucaoiniciante;
/*
 *Faça um programa que leia três valores e apresente o maior dos três valores lidos 
 *seguido da mensagem “eh o maior”. Utilize a fórmula:
 *
 *MaiorAB = (a+b+abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem 
"eh o maior". 
 */

import java.io.IOException;
import java.util.Scanner;

public class OMaior_1013 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

		System.out.println(maiorABC + " eh o maior");

		sc.close();
	}
}