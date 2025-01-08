package resolucaoiniciante;

/*
Toorg é o integrante mais sábio do grupo de heróis denominado Os Protetores da Via Láctea. Para qualquer pergunta, ele tem a resposta ideal! Escreva um programa que, dada uma 
pergunta, informe a resposta de Toorg.

Entrada
A entrada terá diversos casos de teste. A cada caso de teste, um número N é apresentado, que representa o número de casos de teste. Em seguida, haverá N linhas, com as perguntas 
feitas para Toorg.

Saída
Para cada caso de teste, imprima a resposta de Toorg.
 */

import java.io.IOException;
import java.util.Scanner;

public class IAmToorg_2581 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String question = sc.nextLine();
            System.out.println("I am Toorg!");
        }

        sc.close();
    }

}
