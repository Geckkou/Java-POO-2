package aula03_IntroduçãoPOO;

public class Classes {

	public static void main(String[] args) {
		Produto p = new Produto(15, "Computador MSX Expert DDPLUS");
		// p.setCodigo(15);
		// p.setNome("Computador MSX Expert");
		System.out.println("Dados do objeto produto: ");
		System.out.println("c�digo do produto: "+p.getCodigo());
		System.out.println("nome do produto: "+p.getNome());
		
	}
}


class Produto  {
		
		//atributos
		private int codigo;
		private String nome;
	
		//construtor
		public Produto(int c, String n)  {
			codigo = c;
			nome = n;
		}
		
		//getters e setters 
		public void setCodigo(int cod)  {
			codigo = cod;
		}
		
		public void setNome(String n)  {
			nome = n;
		}
		
		public int getCodigo()  {
			return codigo;
		}
	
		public String getNome()  {
			return nome;
		}
	}


