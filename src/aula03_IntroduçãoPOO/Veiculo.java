package aula03_IntroduçãoPOO;

public class Veiculo {
	private String placa;
	private String dono;
	private String modelo;
	private String fabricante;
	private double valor;
	
	public Veiculo(String placa,  String dono, String modelo, String fabricante, double valor) {
		this.placa = placa;
		this.dono = dono;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.valor = valor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
