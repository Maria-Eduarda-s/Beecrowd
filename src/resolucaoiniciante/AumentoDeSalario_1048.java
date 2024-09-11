package resolucaoiniciante;

/*
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de 
 * acordo com a tabela abaixo:

Salário
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

Percentual de Reajuste
15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor 
de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos 
devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, 
conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class AumentoDeSalario_1048 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double salario = sc.nextDouble();
		Double novosalario, reajuste;
		int percentual;

		if (salario <= 400) {
			novosalario = ((salario * 15) / 100) + salario;
			reajuste = (salario * 15) / 100;
			percentual = 15;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: " + percentual + " %");
		} else if (salario > 400 && salario <= 800) {
			novosalario = ((salario * 12) / 100) + salario;
			reajuste = (salario * 12) / 100;
			percentual = 12;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: " + percentual + " %");
		} else if (salario > 800 && salario <= 1200) {
			novosalario = ((salario * 10) / 100) + salario;
			reajuste = (salario * 10) / 100;
			percentual = 10;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: " + percentual + " %");
		} else if (salario > 1200 && salario <= 2000) {
			novosalario = ((salario * 7) / 100) + salario;
			reajuste = (salario * 7) / 100;
			percentual = 7;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: " + percentual + " %");
		} else if (salario > 2000) {
			novosalario = ((salario * 4) / 100) + salario;
			reajuste = (salario * 4) / 100;
			percentual = 4;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: " + percentual + " %");
		}
		sc.close();
	}
}