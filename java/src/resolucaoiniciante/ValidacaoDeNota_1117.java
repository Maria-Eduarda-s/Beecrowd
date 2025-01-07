package resolucaoiniciante;
/*
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas 
 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve 
 * ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve 
ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem 
"media = " seguido do valor do cálculo. O valor deve ser apresentado com duas 
casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota_1117 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] nota = new double[2];
		boolean N = false;
		int contador = 0;

		while (contador < 2) {
			while (!N) {
				Double notas = sc.nextDouble();
				if (notas > 0 && notas <= 10) {
					nota[contador] = notas;
					N = true;
				} else {
					System.out.println("nota invalida");
				}
			}
			N = false;
			contador++;
		}
		sc.close();
		System.out.printf("media = %.2f%n", ((nota[0] + nota[1]) / 2));
	}
}