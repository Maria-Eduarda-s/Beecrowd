package resolucaoIniciante;

/*
 *Leia um valor inteiro N que é a quantidade de casos de teste que vem a 
 *seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve 
 *apresentar a soma de Y ímpares consecutivos a partir de X inclusive o 
 *próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente 
à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente 
à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de 
teste que vem a seguir. Cada caso de teste consiste em uma linha contendo 
dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números ímpares a partir do valor X.
 */

import java.io.IOException;
import java.util.Scanner;

public class SomaDeImparesConsecutivosIII_1158 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int j = 0;
			int resultado = 0;
			int X = sc.nextInt();
			int Y = sc.nextInt();
			while(j < Y) {
				if(X % 2 != 0) {
					resultado += X;
					j++;
				}
				X++;
			}
			System.out.println(resultado);
		}
		sc.close();
	}

}
