package aula04_encapsulamento;

public class Encapsulamento {
	private int codigo;
	private String nome;
	private double preco;
	private double descontoAVista;
	
	//construtor
	public Encapsulamento(int codigo, String nome, double preco, double descontoAVista) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.descontoAVista = descontoAVista;
	}
	
	public void precoVista(double preco) {
		  this.preco = preco;
	}
	
	//getters e setters
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
	

	public double getDescontoAVista() {
		return descontoAVista;
	}
	public void setDescontoAVista() {
		double valorcomDesconto = 0;
		if((this.descontoAVista > 100) || (this.descontoAVista < 0)) {
			this.descontoAVista = 0;
		}else {
			valorcomDesconto = (this.preco * this.descontoAVista)/100;
			this.descontoAVista = this.preco - valorcomDesconto;
		}
	}
	
	
	
	
}
