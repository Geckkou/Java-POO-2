package aula01_revisaoExercicios;

public class ExercicioElevado {
	
	public static double power(double a, int b) {
		double result = 1;
		for (int i =1; i <= b; i++ ) {
			result = result *a;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExercicioElevado elevado = new ExercicioElevado();
		System.out.println(elevado.power(2, 3));
		

	}

}
