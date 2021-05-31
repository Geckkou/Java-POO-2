package aula07_polimorfismo;

public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	private double desconto_a_vista;
	
	public Produto(int codigo, String nome, double preco, double desconto_a_vista) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.desconto_a_vista = desconto_a_vista;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto_a_vista() {
		return desconto_a_vista;
	}

	public void setDesconto_a_vista(double desconto_a_vista) {
		this.desconto_a_vista = desconto_a_vista;
	}

	@Override
	public String toString() {
		return " \nProduto: [codigo = " + codigo + ", nome = " + nome + ", preco = " + preco + ", desconto_a_vista = "
				+ desconto_a_vista + "]";
	}
	
	
	
	

}
