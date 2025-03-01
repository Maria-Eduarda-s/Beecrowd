package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
O seu professor gostaria de fazer um programa com as seguintes características:

Crie 3 variáveis para armazenar uma frase de no máximo 100 caracteres;
Leia uma frase para a primeira variável;
Leia uma frase para a segunda variável;
Leia uma frase para a terceira variável;
Imprima a primeira variável lida no passo 2, a segunda variável lida no passo 3, a terceira variável lida no passo 4. Não esqueça de pular linha;
Imprima a primeira variável lida no passo 3, a segunda variável lida no passo 4, a terceira variável lida no passo 2. Não esqueça de pular linha;
Imprima a primeira variável lida no passo 4, a segunda variável lida no passo 2, a terceira variável lida no passo 3. Não esqueça de pular linha;
Repita o procedimento 5, imprimindo só 10 caracteres de cada variável.
Entrada
A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três linhas. Na primeira linha tem uma variável A que armazena uma frase 
de no máximo 100 caracteres. Na segunda linha tem uma variável B que armazena uma frase de no máximo 100 caracteres. Na terceira linha tem uma 
variável C que armazena uma frase de no máximo 100 caracteres. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro linhas da forma descrita nos itens 5, 6, 7 e 8. Conforme 
mostra o exemplo de saída a seguir.
 */

public class EntradaESaidaDeString_2760 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        String frase1 = sc.nextLine();
        String frase2 = sc.nextLine();
        String frase3 = sc.nextLine();

        System.out.println(frase1 + frase2 + frase3);
        System.out.println(frase2 + frase3 + frase1);
        System.out.println(frase3 + frase1 + frase2);

        System.out.println(
            (frase1.length() > 10 ? frase1.substring(0, 10) : frase1) +
            (frase2.length() > 10 ? frase2.substring(0, 10) : frase2) +
            (frase3.length() > 10 ? frase3.substring(0, 10) : frase3)
        );
        sc.close();
    }
}