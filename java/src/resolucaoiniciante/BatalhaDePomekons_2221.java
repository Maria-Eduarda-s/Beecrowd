package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Depois de capturar muitos Pomekons, Dabriel e Guarte resolveram batalhar. A forma de duelo é simples, cada treinador coloca um Pomekon na batalha e vence quem tem o Pomekon com maior valor de golpe, 
que é definido da seguinte maneira:


O Bônus será dado ao Pomekon do treinador que estiver em um level de valor par.

Neste problema será dado a você o valor do bônus aplicado, os valores de ataque e defesa do Pomekon de Dabriel e Guarte e seus respectivos níveis, cabe a você informar o ganhador da batalha.

Entrada
A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de instâncias. Cada instância começa com um inteiro B (0 ≤ B ≤ 100), que indica o valor 
do bônus aplicado. Nas duas linhas seguintes terão três inteiros Ai, Di e Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), representado o valor de ataque do Pomekon, o valor de defesa e o level do treinador. A 
primeira linha representa o Pomekon de Dabriel e a segunda o de Guarte.

Saída
Para instância na entrada você deverá imprimir o nome do treinador que irá vencer a batalha, em caso de empate imprima: "Empate", sem aspas.
 */

public class BatalhaDePomekons_2221 {

    public static void main(String[] args) throws IOException{
        

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int b = sc.nextInt();
            int[] valoresDeGolpe = new int[2];

            for(int j = 0; j < 2; j++){
                int ai = sc.nextInt();
                int di = sc.nextInt();
                int li = sc.nextInt();

                valoresDeGolpe[j] = (ai + di) / 2;

                if (li % 2 == 0) {
                    valoresDeGolpe[j] += b;
                }
            }

            if (valoresDeGolpe[0] > valoresDeGolpe[1]) {
                System.out.println("Dabriel");
            } else if (valoresDeGolpe[0] < valoresDeGolpe[1]) {
                System.out.println("Guarte");
            } else {
                System.out.println("Empate");
            }
        }
        sc.close();
    }
}
