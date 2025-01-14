package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

public class BalaoDeHonra_2987 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        char l = sc.next().charAt(0);
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i< alfabeto.length; i++){
            if(Character.toLowerCase(l) == alfabeto[i]){
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}
