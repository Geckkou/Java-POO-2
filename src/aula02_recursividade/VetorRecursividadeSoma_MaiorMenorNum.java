package aula02_recursividade;

public class VetorRecursividadeSoma_MaiorMenorNum {

	public static void main(String[] args) {
		int [] v = {6,7,9,4,2,15} ;
		
		int soma = vetSoma(v, 0);
		int menor = vetMenor(v, 0, v.length -1);
		int maior = vetMaior(6, v);
		System.out.println(soma);
		System.out.println(menor);
		System.out.println(maior);

	}
	
	public static int vetSoma(int [] v, int i) {
		if(i < v.length) {
			return v[i] + vetSoma(v, i + 1);
		}else {
			return 0;
		}	
	}
	
	/*
	 * Solução do professor
	    public static int somaVetor(int v[], int n ) {​​​​​
		if (n == 1)
		return v[0];
		else
		return v[n-1] + somavetor(v, n-1);
		}
		*/	
	
	public static int vetMenor(int [] v, int i,int f) {
		if(i == f) {
			return v[i];
		}else {
			int n1,n2;
			int m;
			
			m =(i + f)/2;
			n1 =vetMenor(v, i, m);
			n2 = vetMenor(v, m+1, f);
			
			if(n1 < n2 ) {
				return n1;
			}else {
				return n2;
			}
		}
	}
	
	public static int vetMaior(int n, int[]v) {
		int x;
		if(n == 1 ) {
			return x = v[0];
		}else {	
			x = vetMaior(n - 1, v);
			if(x < v[n-1]) {
				x= v[n-1];
			}
		}
		return x; 
	}
	
	

}
