package resolucaoiniciante;

/*
Tim é um bebedor de refrigerante absolutamento obsessivo, ele simplesmente não consegue o suficiente. Mais irritantemente porém, ele quase nunca tem dinheiro, então sua 
única forma legal mais óbvia de obter mais refrigerante é pegar o dinheiro que ele recebe quando recicla garrafas vazias de refrigerante para comprar novas. Para adicionar 
com as garrafas resultantes de seu próprio consumo, ele às vezes encontra garrafas vazias na rua. Um dia ele estava com muita sede, então ele realmente bebeu refrigerantes 
até que ele não pudesse pagar um novo.

Entrada
A entrada cosiste de três inteiros não negativos E, F, C, onde E < 1000 é igual ao número de garrafas de refrigerante vazias na posse de Tim no ínicio do dia, F < 1000 é o 
número de garrafas de refrigerante vaizas encontradas durante o dia, e 1 < C < 2000 é o número de garrafas vazias necessárias para comprar um novo refrigerante.

Saída
Quantos refrigerantes Tim bebeu em seu dia de muita sede?
 */

import java.io.IOException;
import java.util.Scanner;

public class Refrigerante_3214 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        int garrafasVazias = e + f;
        int refrigerantesBebidos = 0;

        while (garrafasVazias >= c) { 
            int novosRefrigerantes = garrafasVazias / c;
            refrigerantesBebidos += novosRefrigerantes;
            garrafasVazias = (garrafasVazias % c) + novosRefrigerantes;
        }

        System.out.println(refrigerantesBebidos);
        sc.close();
    }

}
