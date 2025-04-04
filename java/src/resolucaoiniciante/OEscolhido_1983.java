package resolucaoiniciante;

/*
As aulas do Prof. Jatobá estão dando o que falar. Os representantes do MEC vieram até a UNIME de Lauro de Freitas para saber mais detalhes sobre essa nova forma 
de ensinar Algoritmos. Além disso, eles queriam selecionar 1 aluno para participar da OBI-Tec (Olimpíada Brasileira de Informática Nível Técnica) e representar a 
rede Kroton na competição, pois sabem que lá estão os melhores. Para selecionar o melhor, eles têm disponível uma lista com o número de inscrição de cada aluno e 
a sua respectiva nota na disciplina. Sua tarefa é ajudar o pessoal do MEC a encontrar o aluno mais apto a representar a instituição e quem sabe garantir sua vaga. 
Só tem um detalhe, se a nota mais alta não for maior ou igual a 8, você deverá imprimir “Minimum note not reached”.

Entrada
O arquivo contém primeiro a quantidade de alunos (3 <= n <= 100) existentes e em seguida, os n alunos contendo o número da matrícula (0 < m < 1000000) de cada um, 
seguido da respectiva nota (0 <= nota <= 10.0, com 1 casa decimal).

Obs.: as notas não serão repetidas. Ou seja, não tem chance de ter dois alunos com a mesma nota.

Saída
Você deve imprimir o número do estudante que obteve a maior pontuação ou "Minimum note not reached" (sem aspas) caso nenhum estudante tenha tirado uma nota maior ou 
igual a 8.
 */

import java.io.IOException;
import java.util.Scanner;

public class OEscolhido_1983 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int melhorMatricula = -1;
        double maiorNota = -1.0;

        for (int i = 0; i < n; i++) {
            int matricula = sc.nextInt();
            double nota = sc.nextDouble();

            if (nota > maiorNota) { 
                maiorNota = nota;
                melhorMatricula = matricula;
            }
        }

        if (maiorNota >= 8.0) {
            System.out.println(melhorMatricula);
        } else {
            System.out.println("Minimum note not reached");
        }

        sc.close(); 
        
    }
}
