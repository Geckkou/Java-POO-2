package aula01_revisaoExercicios;

import java.util.Scanner;

public class ExercicioNumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe um valor e descubra todos os números primos entre 1 e x: ");
		int n;
		boolean primo;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 2; i <= n; i++) {
			primo = true;
			for(int j = 2 ; j <= i; j++) {
				if(i % j == 0 && i != j) {
					primo  = false;
					break;
				}
			}
			if(primo) {
				System.out.println(i);
			}
		}
		/* Solução do professor
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o limite de busca de primos: ");
		int n = s.nextInt();
		int i = 2, mult = 0;
		while (i <=n) {
		mult=0;
		for (int cont = 2; cont < i; cont = cont + 1) {
		if (i % cont == 0) {
		mult=1;
		}
		}
		if (mult==0)
		System.out.print(" "+i+" ");
		i = i + 1;
		}
		*/
	}
}
