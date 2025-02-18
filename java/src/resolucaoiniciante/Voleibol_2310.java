package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores 
fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo 
tiveram sucesso.

Entrada
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira 
linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de 
saques, bloqueios e ataques deste jogador que tiveram sucesso.

Saída
A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.
 */

public class Voleibol_2310 {

      public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int totalSaques = 0, totalBloqueios = 0, totalAtaques = 0;
        int totalSaquesSucesso = 0, totalBloqueiosSucesso = 0, totalAtaquesSucesso = 0;

        for (int i = 0; i < n; i++) {
            sc.next();

            int S = sc.nextInt(), B = sc.nextInt(), A = sc.nextInt();
            int S1 = sc.nextInt(), B1 = sc.nextInt(), A1 = sc.nextInt();

            totalSaques += S;
            totalBloqueios += B;
            totalAtaques += A;

            totalSaquesSucesso += S1;
            totalBloqueiosSucesso += B1;
            totalAtaquesSucesso += A1;
        }

        double saquePercent = (totalSaques == 0) ? 0.0 : (totalSaquesSucesso * 100.0) / totalSaques;
        double bloqueioPercent = (totalBloqueios == 0) ? 0.0 : (totalBloqueiosSucesso * 100.0) / totalBloqueios;
        double ataquePercent = (totalAtaques == 0) ? 0.0 : (totalAtaquesSucesso * 100.0) / totalAtaques;

        System.out.printf("Pontos de Saque: %.2f %%.\n", saquePercent);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", bloqueioPercent);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", ataquePercent);

        sc.close();
    }

}
