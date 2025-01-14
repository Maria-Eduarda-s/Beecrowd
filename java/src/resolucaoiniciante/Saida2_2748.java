package resolucaoiniciante;

/*
O seu professor de programação gostaria de fazer uma tela com as seguintes características:

Ter 39 traços (-) na primeira linha;
Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 10 traço deve começar a escrever a palavra 
"Roberto" e o restante preencher no meio com espaço em branco;
Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 10 traço deve começar a escrever o número 
"5786" e o restante preencher no meio com espaço em branco;
Repita o procedimento 3;
Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 10 traço deve começar a escrever a palavra 
"UNIFEI" e o restante preencher no meio com espaço em branco;
Repita o procedimento 1.
No final deve ficar igual a imagem a seguir:

--------------------------------------- (39 traços)
|        Roberto                      |
|                                     |
|        5786                         |
|                                     |
|        UNIFEI                       |
--------------------------------------- (39 traços)

Entrada
Não há.

Saída
A saída será impresso conforme a figura acima.
 */

import java.io.IOException;

public class Saida2_2748 {

    public static void main(String[] args) throws IOException{

        int largura = 39;
        String[] conteudo = {"Roberto", "", "5786", "", "UNIFEI"};

        for (int i = 0; i < largura; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (String linha : conteudo) {
            System.out.print("|");
            if (linha.isEmpty()) {
                for (int i = 0; i < largura - 2; i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("        " + linha);
                for (int i = 0; i < largura - 10 - linha.length(); i++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        for (int i = 0; i < largura; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
