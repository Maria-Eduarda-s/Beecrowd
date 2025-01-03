package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

public class EscolhaDificil_2702 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int B = sc.nextInt();
        int P = sc.nextInt();

        int cOrder = sc.nextInt();
        int bOrder = sc.nextInt();
        int pOrder = sc.nextInt();
        int result = 0;

        if(cOrder > C){
           result += cOrder - C;
        }
        if (bOrder > B) {
            result += bOrder - B;
        }
        if (pOrder > P) {
            result += pOrder - P;
        }

        System.out.println(result);

        sc.close();

    }

}
