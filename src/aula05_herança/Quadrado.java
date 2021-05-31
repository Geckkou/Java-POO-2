package aula05_herança;

public class Quadrado extends Retangulo{
	
	private double lados;

	public Quadrado(double base, double altura, double lados) {
		super(base, altura);
		this.lados = lados;
	}

	public double getLados() {
		return lados;
	}

	public void setLados(double lados) {
		this.lados = lados;
	}
	
	public double area() {
		return Math.pow(getLados(), 2);
	}
	
	public double perimetro() {
		return this.getLados() * 4;
	}
}
