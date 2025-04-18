package resolucaoiniciante;
/*
 *Um Posto de combustíveis deseja determinar qual de seus produtos tem a 
 *preferência de seus clientes. Escreva um algoritmo para ler o tipo de 
 *combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 
 *3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 
 *1 a 4) deve ser solicitado um novo código (até que seja válido). O programa 
 *será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que 
abasteceram cada tipo de combustível, conforme exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class TipoDeCombustivel_1134 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;
		int codigo = sc.nextInt();

		while (true) {
			if (codigo > 0 && codigo < 4) {
				if (codigo == 1) {
					alcool++;
				} else if (codigo == 2) {
					gasolina++;
				} else {
					diesel++;
				}

			} else if (codigo == 4) {
				break;
			} else {
				codigo = sc.nextInt();
				continue;
			}
			codigo = sc.nextInt();
		}
		sc.close();

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
}