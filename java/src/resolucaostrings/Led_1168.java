package resolucaostrings;

/*
João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem certeza se conseguirá montar o número desejado. 
Considerando a configuração dos leds dos números abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.

Obs.: Para programadores de Javascript, recomenda-se o uso de "input.trim().split('\n')" para evitar erros conhecidos.




Entrada
A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N linhas, cada linha contendo um número 
(1 ≤ V ≤ 10100) correspondente ao valor que João quer montar com os leds.

Saída
Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o valor desejado, seguido da palavra "leds".
 */

import java.io.IOException;
import java.util.Scanner;

public class Led_1168 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < n; i++) {
            String numero = sc.nextLine();
            int led = 0;

            for (int j = 0; j < numero.length(); j++) {
                int digito = Character.getNumericValue(numero.charAt(j));
                led += ledsPorDigito[digito];
            }

            System.out.println(led + " leds");
        }

        sc.close();
    }

}
