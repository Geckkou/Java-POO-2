package aula08_interface;

public class Circulo implements FormaGeometrica{
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * (Math.pow(raio, 2));
	}
	
	public static String format(double x) {
		return String.format("%.1f", x);
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Dados: " + "\n Raio do Círculo: " + this.getRaio() + "\n Área: " + format(this.getArea()) + "\n";
	}
	
	

}
