package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

public class Feijao_2791 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] beans = input.split(" ");

        for(int i = 0; i < beans.length; i++){
            if(beans[i].equals("1")){
                System.out.println(i + 1);
            }
        }
        sc.close();
    }
}