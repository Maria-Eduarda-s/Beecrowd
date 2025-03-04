package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
William, John é um aluno vidrado por matemática, mas poucas pessoas sabem disso. Certo dia, um de seus colegas de classe achando que John não sabia conceitos básicos da matemática o desafiou 
a realizar um simples cálculo que era: Calcular o resto da divisão de A ÷ B

Como John é muito tímido e vocês são melhores amigos, ele te informou qual era a resposta para o problema e pediu para que você passasse tal informação para esse colega que o desafiou. Você 
pode fazer isso ?

Dado dois inteiros A e B, diga qual o resto da divisão de A ÷ B que John passou para você.

Entrada
A entrada contém dois inteiros A e B (1 <= A, B <= 100000).

Saída
A saída contém um único inteiro que é o resto da divisão de A ÷ B.
 */

public class Resto10_3091 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int resto = A % B;
        System.out.println(resto);
        
        sc.close();
    }
}