package aula02_recursividade;

import java.util.Scanner;

public class FuncaoRecursiva_SequenciaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe quantos números vão ser retornados: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i =0; i < n; i++) {
			System.out.println(fibonacci(i));
		}

	}
	
	public static int fibonacci(int valor) {
		return (valor <2) ? valor: fibonacci(valor -1) + fibonacci(valor -2);
	}
}
