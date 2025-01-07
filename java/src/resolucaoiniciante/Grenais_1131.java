package resolucaoiniciante;
/*
 *A Federação Gaúcha de Futebol contratou você para escrever um programa para 
 *fazer uma estatística do resultado de vários GRENAIS. Escreva um programa 
 *para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
 *Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma 
 *resposta. Se a resposta for 1, o algoritmo deve ser executado novamente 
 *solicitando o número de gols marcados pelos times em uma nova partida, caso 
 *contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS 
(ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols 
marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um inteiro 
(1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem 
"Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado devem ser 
mostradas as estatísticas conforme a descrição apresentada acima. 
Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo. 
 */

import java.io.IOException;
import java.util.Scanner;

public class Grenais_1131 {
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int continuar = 0, j = 1, totalInter = 0, totalGremio = 0, 
				totalGrenal = 0, empate = 0;

		while (true) {
			int inter = sc.nextInt();
			int gremio = sc.nextInt();

			if (inter == gremio) {
				empate++;
			} else if (inter > gremio) {
				totalInter++;
			} else {
				totalGremio++;
			}
			totalGrenal++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			continuar = sc.nextInt();
			if (continuar == 2) {
				break;
			}
		}

			System.out.println(totalGrenal + " grenais");
			System.out.println("Inter:" + totalInter);
			System.out.println("Gremio:" + totalGremio);
			System.out.println("Empates:" + empate);

			if (totalInter > totalGremio) {
				System.out.println("Inter venceu mais");
			} else if (totalGremio > totalInter) {
				System.out.println("Gremio venceu mais");
			} else {
				System.out.println("Nao houve vencedor");
			}

		sc.close();
	}
}