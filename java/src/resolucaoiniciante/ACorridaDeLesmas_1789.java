package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
A corrida de lesmas é um esporte que cresceu muito nos últimos anos, fazendo com que várias pessoas dediquem suas vidas tentando capturar lesmas 
velozes, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar lesmas velozes não é uma tarefa muito fácil, pois 
praticamente todas as lesmas são muito lentas. Cada lesma é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .


Sua tarefa é identificar qual nível de velocidade da lesma mais veloz de um grupo de lesmas.

Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando 
o número de lesmas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada lesma do grupo.

A entrada termina com o fim do arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da lesma mais veloz do grupo.
 */

public class ACorridaDeLesmas_1789 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int l = sc.nextInt();

            int[] velocidadeLesmas = new int[l];

            for (int i = 0; i < l; i++) {
                velocidadeLesmas[i] = sc.nextInt();
            }

            int melhorLesma = velocidadeLesmas[0];

            for (int i = 1; i < l; i++) {
                if (velocidadeLesmas[i] > melhorLesma) {
                    melhorLesma = velocidadeLesmas[i];
                }
            }

            if(melhorLesma < 10){
                System.out.println("1");
            }else if(melhorLesma >= 10 && melhorLesma < 20){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
            
        }
        sc.close();
        
    }

}

