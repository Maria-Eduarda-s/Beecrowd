package resolucaoiniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Cinco patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só quatro patinhos voltaram de lá. Quatro patinhos foram passear. 
Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só três patinhos voltaram de lá. Três patinhos foram passear. Além das montanhas. Para brincar. 
A mamãe gritou: quá, quá, quá, quá. Mas só dois patinhos voltaram de lá. Dois patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. 
Mas só um patinho voltou de lá. Um patinho foi passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas nenhum patinho voltou de lá.

A mamãe patinha ficou tão triste naquele dia que resolveu pedir sua ajuda para procurar além das montanhas, na beira do mar, quantos patinhos não voltaram de lá.

Entrada
Haverá vários casos de testes, a primeira linha de cada caso de teste contém um inteiro (0 ≤ P ≤ 1019) representando a quantidade total de patos, a entrada termina com P = -1.

Saída
O arquivo de saída deve conter a quantidade de patinhos que retornaram.
 */

public class Patinhos_2334 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine().trim();
            BigInteger patinho = new BigInteger(input);

            if (patinho.equals(BigInteger.valueOf(-1))) {
                break;
            }

            if (patinho.equals(BigInteger.ZERO)) {
                System.out.println(0);
            } else {
                System.out.println(patinho.subtract(BigInteger.ONE));
            }
        }
    }
}