package resolucaoiniciante;
/*
 *O Sul é uma das regiões que mais contribuem para o Produto Interno Bruto (PIB) 
 *do Brasil. No entanto, devido à pandemia de COVID-19, a economia nos três 
 *estados do Sul foi muito afetada. Alice, uma pesquisadora da Universidade do 
 *Sul, coletou dados sobre a flutuação do PIB de toda a região Sul em cada um dos 
 *dois últimos anos. Cada flutuação é expressa por uma porcentagem, de modo que 
 *uma porcentagem positiva indica crescimento naquele período de um ano, enquanto
 *que uma porcentagem negativa indica decrescimento.

Bob, um político, dará uma entrevista à imprensa amanhã. Com base nos dois 
valores coletados por Alice, Bob deseja calcular a flutuação do PIB 
correspondente ao período todo dos dois anos analisados, para não falar besteira 
na entrevista.

Entrada
A entrada consiste em dois valores F1 e F2 (-100.00 ≤ F1, F2 ≤ 100.00), os quais 
correspondem às flutuações do PIB no primeiro e no segundo anos analisados por 
Alice, respectivamente. Os valores são fornecidos com exatamente duas casas após 
o ponto decimal.

Saída
Imprima um valor, com exatamente seis casas após o ponto decimal, que corresponda 
à flutuação do PIB no período todo dos dois anos analisados.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FlutuacaoDoPIB_3346 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double f1 = sc.nextDouble();
		double f2 = sc.nextDouble();

		double flutuacao = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100;

		System.out.printf("%.6f%n", flutuacao);

		sc.close();
	}
}