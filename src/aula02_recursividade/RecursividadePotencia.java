package aula02_recursividade;

public class RecursividadePotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursividadePotencia elevado = new RecursividadePotencia();
		System.out.println(elevado.power(2, 3));

	}
	
	public double power(double n, int e) {
		if(e == 0) {
			return 1;
		}else {
			return n * power(n, e - 1) ;
		}
	}

}
