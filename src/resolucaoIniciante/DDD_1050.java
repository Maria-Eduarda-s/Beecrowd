package resolucaoIniciante;

/*
 * Leia um número inteiro que representa um código de DDD para discagem interurbana.
 *  Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

61 - Brasilia
71 - Salvador
11 - Sao Paulo
21 - Rio de Janeiro
32 - Juiz de Fora
19 - Campinas
27 - Vitoria
31 - Belo Horizonte

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o 
programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD 
nao cadastrado caso não existir DDD correspondente ao número digitado.
 */

import java.io.IOException;
import java.util.Scanner;

public class DDD_1050 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int ddd = sc.nextInt();

		int brasilia = 61;
		int salvador = 71;
		int saoPaulo = 11;
		int rioDeJaneiro = 21;
		int juizDeFora = 32;
		int campinas = 19;
		int vitoria = 27;
		int beloHorizonte = 31;

		if (ddd == brasilia) {
			System.out.println("Brasilia");
		} else if (ddd == salvador) {
			System.out.println("Salvador");
		} else if (ddd == saoPaulo) {
			System.out.println("Sao Paulo");
		} else if (ddd == rioDeJaneiro) {
			System.out.println("Rio de Janeiro");
		} else if (ddd == juizDeFora) {
			System.out.println("Juiz de Fora");
		} else if (ddd == campinas) {
			System.out.println("Campinas");
		} else if (ddd == vitoria) {
			System.out.println("Vitoria");
		} else if (ddd == beloHorizonte) {
			System.out.println("Belo Horizonte");
		} else {
			System.out.println("DDD nao cadastrado");
		}
		sc.close();
	}
}