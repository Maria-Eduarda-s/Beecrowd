package resolucaoiniciante;

/*
Uma das formas de calcular a raiz quadrada de um número natural é pelo método das frações periódicas continuadas. 
Esse método usa como denominador uma repetição de frações. Essa repetição pode ser feita uma quantidade específica 
de vezes.

Por exemplo, ao repetir 2 vezes a fração continuada para calcular a raiz quadrada de 10, temos a fórmula abaixo.



Sua tarefa é, dado o número N de repetições, calcular o valor aproximado da raiz quadrada de 10.

Entrada
A entrada é um número natural N (0 ≤ N ≤ 100), que indica o número de repetições do denominador na fração continuada.

Saída
A saída é o valor aproximado da raiz quadrada com 10 casas decimais.
 */

import java.io.IOException;
import java.util.Scanner;

public class RaizQuadradaDe10_2161 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double resultado = 0.0;

        for(int i = 0; i < n; i++){
            resultado = 1.0 / (6.0 + resultado);
        }

        resultado += 3.0;

        System.out.printf("%.10f\n", resultado);

        sc.close();
    }
}
