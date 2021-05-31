package aula07_polimorfismo;

public class Livro extends Produto{
	private String autor;
	private String editora;
	
	public Livro(int codigo, String nome, double preco, double desconto_a_vista, String autor, String editora) {
		super(codigo, nome, preco, desconto_a_vista);
		this.autor = autor;
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "\nautor = " + autor + ", editora = " + editora + super.toString();
	}
	
	public String descricao() {
		return "Livro: " + this.toString();
	}
	
	
	

}
