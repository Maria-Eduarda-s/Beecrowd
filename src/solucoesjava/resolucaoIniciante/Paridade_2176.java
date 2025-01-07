package solucoesjava.resolucaoIniciante;

/*
A popularização das redes WiFi aumentou a taxa de perda de informações sendo transferidas, uma vez que diversos fatores
do meio ambiente podem facilmente comprometer os dados durante o tráfego. A URI, Unidade de Recuperação de Informações,
tem como principal objetivo identificar e corrigir erros em mensagens enviadas via redes WiFi.

A técnica utilizada pela URI para identificação de erros é o teste de paridade, o qual pode ser descrito da seguinte
forma: Seja S uma mensagem que será enviada de um dispositivo para outro. Antes de S ser enviada, um bit extra B é
adicionado no final da representação binária de S. Se a mensagem S tiver um número par de bits de valor 1, o bit extra
B terá valor 0. Caso contrário, se S tiver um número ímpar de bits de valor 1, B terá valor 1. Desta forma, após a
inserção do bit B, a mensagem S terá um número par de bits de valor 1.

Quando o destinatário recebe a mensagem S ele faz a contagem de bits de valor 1. Se a quantidade for par, significa que
a mensagem chegou com sucesso. Caso contrário, significa que a mensagem sofreu uma alteração e não está correta.

Sua tarefa é escrever um algoritmo que faça a inserção do bit B na mensagem S, de forma que após a inserção a mensagem
S tenha um número par de bits de valor 1.

Entrada
Cada caso de teste consiste em uma linha contendo a mensagem S, a qual consiste em no mínimo 1 e no máximo 100 bits.

Saída
Imprima uma linha contendo a mensagem S adicionada do bit extra B.
 */

import java.io.IOException;
import java.util.Scanner;

public class Paridade_2176 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String numero = sc.next();
        int contador1 = 0;

        for (char caractere : numero.toCharArray()) {
            if (caractere == '1') {
                contador1++;
            }
        }

        if(contador1 % 2 == 0){
            System.out.println(numero + "0");
        }else{
            System.out.println(numero + "1");
        }


        sc.close();
    }
}