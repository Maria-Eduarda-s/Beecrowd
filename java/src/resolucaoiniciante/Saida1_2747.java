package resolucaoiniciante;

/*
O seu professor de programação gostaria de fazer uma tela com as seguintes características:

Ter 39 traços (-) na primeira linha;
Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
Repita o procedimento 2 mais quatro vezes;
Repita o procedimento 1.
No final deve ficar igual a imagem a seguir:

--------------------------------------- (39 traços)
|                                     |
|                                     |
|                                     |
|                                     |
|                                     |
--------------------------------------- (39 traços)
Entrada
Não há.

Saída
A saída será impressa conforme a figura acima.
 */

import java.io.IOException;

public class Saida1_2747 {

    public static void main(String[] args) throws IOException{
        
        int largura = 39;

        for(int i = 0; largura > i; i++){
            System.out.print("-");
        }
        System.out.println();
        
        for(int i = 0; 5 > i; i++){
            System.out.print("|");
            for(int j = 0; j < largura - 2; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

        for(int i = 0; largura > i; i++){
            System.out.print("-");
        }

        System.out.println();
    }
}