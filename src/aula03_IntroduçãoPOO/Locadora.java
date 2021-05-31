package aula03_IntroduçãoPOO;

public class Locadora {
	private String titulo;
	private double venda;
	private double aluguel;
	
	public Locadora(String titulo, double venda, double aluguel) {
		this.titulo = titulo;
		this.venda = venda;
		this.aluguel = aluguel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public double getAluguel() {
		return aluguel;
	}
	
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	
	public double getAluguelDevido(int dias) {
		return this.aluguel = this.getAluguel() * dias;
	}
	
	
	

}
