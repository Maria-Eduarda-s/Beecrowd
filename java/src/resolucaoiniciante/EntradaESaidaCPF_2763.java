package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

public class EntradaESaidaCPF_2763 {

public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

         String cpf = sc.nextLine();
        
         String[] partes = cpf.split("[.\\-]");
 
         for (String parte : partes) {
             System.out.println(parte);
         }
         sc.close();
    }
}