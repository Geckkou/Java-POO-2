package aula03_IntroduçãoPOO;

public abstract class FuncoesMath {
	
	public static double adicionar(double a, double b) {
		return a+b;
	}
	
	public static double media(double [] vetor) {
		int soma = 0;
		int media= 0;
		for(int i = 0 ; i < vetor.length; i++ ){
			soma+=vetor[i];
		}
		media = soma/vetor.length;
		return media;
	}
	
	
	public static boolean isPrimo(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) 
				return false;
		}
				return true;
	}
	
	
}
