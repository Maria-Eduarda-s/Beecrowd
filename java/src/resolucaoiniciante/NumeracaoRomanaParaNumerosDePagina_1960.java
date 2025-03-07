package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
A ECI (Editio Chronica Incredibilis ou Editora de Crônicas Incríveis) é muito tradicional quando se trata de numerar as páginas 
de seus livros. Ela sempre usa a numeração romana para isso. E seus livros nunca ultrapassam as 999 páginas pois, quando necessário, 
dividem o livro em volumes.

Você deve escrever um programa que, dado um número arábico, mostra seu equivalente na numeração romana.

Lembre que I representa 1, V é 5, X é 10, L é 50, C é 100, D é 500 e M representa 1000.

Entrada
A entrada é um número inteiro positivo N (0 < N < 1000).

Saída
A saída é o número N escrito na numeração romana em uma única linha. Use sempre letras maiúsculas.
 */

public class NumeracaoRomanaParaNumerosDePagina_1960 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder numRomano = new StringBuilder();

        int[] valores = {900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                numRomano.append(romanos[i]);
                n -= valores[i];
            }
        }
        System.out.println(numRomano);

        sc.close();
    }

}
