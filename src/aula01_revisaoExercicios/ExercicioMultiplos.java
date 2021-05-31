package aula01_revisaoExercicios;

import java.util.Scanner;

public class ExercicioMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe um número inteiro e descubra seus múltiplos: ");
		Scanner s = new Scanner (System.in);
		
		int numero = 0;
		numero = s.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			if(numero % 2 == 0) {
				if(i > 1) {
					if(numero % i == 0) {
						System.out.println(numero + " é multiplo de " + i);
					}
				}
			}else {
				System.out.println(numero + " é um número primo");
			}
		}
		//OUTRA SOLUÇÃO 
		
		/*Scanner sc = new Scanner(System.in);
	    int multiplos=0;
	    int i=2;
	    System.out.println("Digite um número inteiro: ");
	    int num = sc.nextInt();

	    while(i < num){
	        if(num % i == 0) {
	            multiplos++;
	            System.out.println(num + " é múltiplo de " + i);
	        }
	        i++;
	    }
	    if(multiplos == 0){
	        System.out.println(num + " é primo");
	    }
	    
	    System.out.println( num + " possui " + multiplos + " múltiplos!");
	    sc.close();*/

	}

}
