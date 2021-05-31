package aula05_herança;

public class MinhaSubClasse extends MinhaClasse{
	
	@Override
	public void meuMetodo(int i) {
		System.out.println("Meu valor é: " + i);
	}

	public MinhaSubClasse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
