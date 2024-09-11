package resolucaoiniciante;

/*
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
 * evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido 
para horas:minutos:segundos, conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeTempo_1019 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();

		int hora = entrada / 3600;
		entrada -= hora * 3600;
		int minutos = entrada / 60;
		int segundo = entrada % 60;

		System.out.println(hora + ":" + minutos + ":" + segundo);

		sc.close();
	}
}