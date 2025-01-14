package resolucaoiniciante;

/*
Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos para Cino resolver. Desta vez, Bino gerou uma lista de números e perguntou ao Cino quantos números da lista são múltiplos de 2, 3, 4 e 5.

Esse desafio pode parecer simples, porém, quando a lista contém muitos números, Cino se confunde e acaba errando alguns cálculos. Para ajudar Cino, faça um programa para resolver o desafio de Bino.

Entrada
A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Bino.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Bino.

Saída
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.
 */

import java.io.IOException;
import java.util.Scanner;

public class DesafioDeBino_2060 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int multDois = 0, multTres = 0, multQuatro = 0, multCinco = 0;

        for(int i = 0; i < n; i++){
            int l = sc.nextInt();
            if(l % 2 == 0){
                multDois++;
            }
            if(l % 3 == 0){
                multTres++;
            }
            if(l % 4 == 0){
                multQuatro++;
            }
            if(l % 5 == 0){
                multCinco++;
            }
        }

        System.out.println(multDois + " Multiplo(s) de 2");
        System.out.println(multTres + " Multiplo(s) de 3");
        System.out.println(multQuatro + " Multiplo(s) de 4");
        System.out.println(multCinco + " Multiplo(s) de 5");
    }
}