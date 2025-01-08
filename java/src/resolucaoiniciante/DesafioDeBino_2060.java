package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

public class DesafioDeBino_2060 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int multDois = 0, multTres = 0, multQuatro = 0, multCinco = 0;

        for(int i = 0; i < n; i++){
            int l = sc.nextInt();
            if(l % 2 == 0){
                multDois++;
            }
            if(l % 3 == 0){
                multTres++;
            }
            if(l % 4 == 0){
                multQuatro++;
            }
            if(l % 5 == 0){
                multCinco++;
            }
        }

        System.out.println(multDois + " Multiplo(s) de 2");
        System.out.println(multTres + " Multiplo(s) de 3");
        System.out.println(multQuatro + " Multiplo(s) de 4");
        System.out.println(multCinco + " Multiplo(s) de 5");
    }
}