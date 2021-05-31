package aula02_recursividade;

import java.util.Scanner;

public class RecursividadeNumeroTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe um número a condição de parada: ");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		for(int  i = 1; i <= n; i++ ) {
			System.out.println(numeroTri(i));
		}
	}
	
	public static int numeroTri(int valor) {
		if(valor == 1) {
			return 1;
			}else {
				return valor  + numeroTri(valor - 1);
			}
	}


}
