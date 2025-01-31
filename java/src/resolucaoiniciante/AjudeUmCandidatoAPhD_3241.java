package resolucaoiniciante;

/*
Jon Marius esqueceu como somar dois números enquanto fazia pesquisas para seu doutorado. E agora ele tem uma longa lista de 
problemas adicionais que precisa resolver, além dos de informática! Você pode ajudá-lo?

Em sua lista atual, Jon Marius tem dois tipos de problemas: problemas de adição na forma ”a + b” e o problema sempre recorrente 
”P = NP”. Jon Marius é uma pessoa bastante distraída, então ele pode ter resolvido esse último problema várias vezes, já que 
sempre se esquece da solução. Além disso, ele gostaria de resolver esses problemas sozinho, portanto, você deve ignorá-los.

Entrada
A primeira linha de entrada será um único inteiro N (1 ≤ N ≤ 1000) denotando o número de casos de teste. Em seguida, siga N linhas 
com ”P = NP” ou um problema de adição na forma ”a + b”, onde a, b ∈ [0, 1000] são inteiros.

Saída
Produza o resultado de cada adição. Para linhas contendo “P = NP”, imprima “pulado”.
 */

import java.io.IOException;
import java.util.Scanner;

public class AjudeUmCandidatoAPhD_3241 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String entrada = sc.nextLine();
            if(entrada.equals("P=NP")){
                System.out.println("skipped");
            }else{
                String[] numeros = entrada.split("\\+");
                int a = Integer.parseInt(numeros[0]);
                int b = Integer.parseInt(numeros[1]);
                System.out.println(a + b);
            }
        }
        sc.close();
    }
}
