package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
O Reino dos Emparelhamentos é governado por um generoso Comendador. A fama do Comendador e de suas grandes qualidades é conhecida por todos, inclusive em reinos vizinhos. 
Uma de suas mais famosas qualidades é seu bom humor, que é nutrido diariamente por um bobo da corte, eleito anualmente no Grande Concurso de Comédia (GCC) do reino. O bobo 
da corte ajuda a aliviar as tensões das diversas reuniões polı́ticas que o cargo exige, alegrando não só o Comendador como também todo o reino.

O jovem Carlos é um grande comediante cujo sonho é se tornar bobo da corte na próxima tem- porada. Ele passou os últimos meses anotando piadas e trocadilhos dos mais diversos 
tipos, muitos dos quais sobre sua própria (diminuta) estatura. Chegou a época da eleição do bobo da corte, e um total de N candidatos se inscreveram. Cada um dos candidatos 
terá cinco minutos para se apresentar perante uma platéia. Após as apresentações, cada cidadão do Reino dos Emparelhamentos poderá votar em um dos candidatos, e o mais votado 
será o novo bobo da corte. Caso haja empate entre um ou mais candidatos, aquele que tiver feito a inscrição primeiro é eleito. Sabendo disso, o jovem Carlos passou noites na 
frente do escritório eleitoral e garantiu que sua inscrição fosse a primeira a ser feita.

Após a votação, resta apenas apurar os resultados. A urna eletrônica gera um relatório com N inteiros, correspondentes ao número de votos de cada candidato, ordenados pela 
ordem de inscrição. Sua missão é determinar se o jovem Carlos foi eleito ou não.

Entrada
A primeira linha da entrada contém um inteiro N, satisfazendo 2 ≤ N ≤ 104 . As N linhas seguintes conterão N inteiros positivos v 1 , . . . , vN , um em cada linha, correspondentes 
ao número de votos recebido por cada um dos candidatos, em ordem de inscrição. Como a população do Reino dos Emparelhamentos é de 100.000 pessoas, o número total de votos não será 
superior a este valor, ou ∑Nk=1vi≤100.000.

Saída
Seu programa deve produzir uma única linha contendo o caractere ‘S’ caso o jovem Carlos seja eleito bobo da corte, ou o caractere ‘N’ caso contrário.
 */

public class BoboDaCorte_2963 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] votos = new int[n];

        for (int i = 0; i < n; i++) {
            votos[i] = sc.nextInt();
        }

        int maxVotos = votos[0];
        for (int i = 1; i < n; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
            }
        }

        if (votos[0] == maxVotos) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}