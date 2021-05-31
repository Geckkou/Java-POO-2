package aula02_recursividade;

import java.util.Scanner;

public class RecursividadeSomaAlgarismosDeUmNum {

	public static void main(String[] args) {
		System.out.print("Informe um número para saber a soma dos seus algorismos: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int soma = somaAlgarismo(n);
		System.out.println(soma);

	}
	
	public static int somaAlgarismo(int n) {
		if(n <10) {
			return n;
		}else {
			return somaAlgarismo(n/10) + n%10;
		}
	}
}
