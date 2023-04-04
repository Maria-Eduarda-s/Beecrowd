package resolucaoIniciante;

/*
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal 
 * possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida 
 * conclua qual dos animais seguintes foi escolhido, através das três palavras
 *  fornecidas.
 *  
		 * vertebrado > ave > carnivoro > aguia
		 * vertebrado > ave > onivoro > pomba
		 * vertebrado > mamifero > onivoro > homem
		 * vertebrado > mamifero > herbivoro > vaca
		 * 
		 * 
		 * invertebrado > inseto > hematofago > pulga
		 * invertebrado > inseto > herbivoro > lagarta
		 * invertebrado > anelideo > hematofago > sanguessuga
		 * invertebrado > anelideo > onivoro > minhoca
 *  
 *Entrada
 A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
 animal segundo a figura acima, com todas as letras minúsculas.

 Saída
 Imprima o nome do animal correspondente à entrada fornecida.
 */

import java.io.IOException;
import java.util.Scanner;

public class Animal_1049 {
public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String tipo, classe, dieta;
		String vertebrado = "vertebrado";
		String invertebrado = "invertebrado";
		String mamifero = "mamifero";
		String ave = "ave";
		String inseto = "inseto";
		String anelideo = "anelideo";
		String herbivoro = "herbivoro";
		String onivoro = "onivoro";
		String carnivoro = "carnivoro";
		String hematofago = "hematofago";
		
		tipo = sc.next();
		classe = sc.next();
		dieta = sc.next();
		
		if ((tipo.equals(vertebrado)) && (classe.equals(ave)) && (dieta.equals(carnivoro))) {
			System.out.println("aguia");
		}
		else if ((tipo.equals(vertebrado)) && (classe.equals(ave)) && (dieta.equals(onivoro))) {
			System.out.println("pomba");
		}
		else if ((tipo.equals(vertebrado)) && (classe.equals(mamifero)) && (dieta.equals(onivoro))) {
			System.out.println("homem");
		}
		else if ((tipo.equals(vertebrado)) && (classe.equals(mamifero)) && (dieta.equals(herbivoro))) {
			System.out.println("vaca");
		}
		else if ((tipo.equals(invertebrado)) && (classe.equals(inseto)) && (dieta.equals(hematofago))) {
			System.out.println("pulga");
		}
		else if ((tipo.equals(invertebrado)) && (classe.equals(inseto)) && (dieta.equals(herbivoro))) {
			System.out.println("lagarta");
		}
		else if ((tipo.equals(invertebrado)) && (classe.equals(anelideo)) && (dieta.equals(hematofago))) {
			System.out.println("sanguessuga");
		}
		else if ((tipo.equals(invertebrado)) && (classe.equals(anelideo)) && (dieta.equals(onivoro))) {
			System.out.println("minhoca");
		}
		else {
		}
	}
}