package resolucaoiniciante;

/*
 *Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?
 */

import java.io.IOException;
import java.util.Locale;

public class SequenciaIJ4_1098 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
	
		double i = 0;
		double j = 1;
		
		for (i = 0; i <= 2; i += 0.2) {
            for (int k = 1; k <= 3; k++) {
            	if( i == 0 || i == 1) {
            		int iinteiro = (int) i;
            		int jinteiro = (int) j;
            		System.out.println("I=" + iinteiro + " J=" + jinteiro);            		
            	}else if(i > 1.8) {
            			int iinteiro = 2;
            			int jinteiro = (int) j;
            			System.out.println("I=" + iinteiro + " J=" + jinteiro); 
            			
            		}else {
            		System.out.printf("I=%.1f J=%.1f%n", i, j);            		
            	} 
            	j++;
            }
            j -= 3;
            j+=0.2;
        }
	}
}
