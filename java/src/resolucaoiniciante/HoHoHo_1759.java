package resolucaoiniciante;
/*
 * Papai Noel está brincando com seus duendes para entretê-los durante a véspera do 
 * Natal. A brincadeira consiste nos elfos escreverem números em pedaços de papel e 
 * colocarem no gorro do Papai Noel. Após todos terminarem de colocar os números Noel 
 * sorteia um papel e aquele número representa quantos "Ho" o Noel deve falar.

Seu trabalho é ajudar o Papai Noel montando um problema que mostre todos os "Ho" que ele
 deve falar dado o número sorteado.

Entrada
A entrada é composta por um único inteiro N (0 < N ≤ 106) representando quantos "Ho" 
serão falados por Noel.

Saída
A saída é composta por todos "Ho" que Papai Noel deve falar separados por um espaço. 
Após o último "Ho" deve ser apresentado um "!" encerrando o programa.
 */

import java.io.IOException;
import java.util.Scanner;

public class HoHoHo_1759 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for(int i = 1; i < N; i++) {
			System.out.print("Ho ");
		}
		
		System.out.println("Ho!");

		sc.close();
	}
}
