package resolucaoiniciante;

/*
O seu professor gostaria de fazer um programa com as seguintes características:

Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
Imprima os quatro números, sendo um valor por linha.
Entrada
A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma linha. 
A linha tem o seguinte formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros. 
Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro linhas 
com um número inteiro em cada uma delas, conforme foi entrado. Conforme mostra o exemplo de 
saída a seguir.
 */

import java.io.IOException;
import java.util.Scanner;

public class EntradaESaidaCPF_2763 {

public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

         String cpf = sc.nextLine();
        
         String[] partes = cpf.split("[.\\-]");
 
         for (String parte : partes) {
             System.out.println(parte);
         }
         sc.close();
    }
}