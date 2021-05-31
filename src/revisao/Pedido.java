package revisao;

public class Pedido {
	private int codigo;
	private String nome;
	private double valor;
	
	public Pedido(int codigo, String nome, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public Pedido() {
		
	}
	
	
	public int getCodigo(){
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
