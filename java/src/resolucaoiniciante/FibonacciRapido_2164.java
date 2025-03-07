package resolucaoiniciante;

import java.util.Scanner;

/*
A fórmula de Binet é uma forma de calcular números de Fibonacci.



Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.
 */

public class FibonacciRapido_2164 {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double fibonacci = (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5);

        System.out.printf("%.1f%n", fibonacci);

        sc.close();
    }
}