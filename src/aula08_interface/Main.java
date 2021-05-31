package aula08_interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormaGeometrica [] forma = new FormaGeometrica[2];
		
		forma[0] = new Retangulo(2, 5);
		forma[1] = new Circulo(5);
		
		for(int i = 0; i < forma.length; i++) {
			System.out.println(forma[i].getDescricao());
		}
	}

}
