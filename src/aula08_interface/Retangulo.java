package aula08_interface;

public class Retangulo implements FormaGeometrica{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	

	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}


	public static String format(double x) {
		return String.format("%.1f", x);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getBase() * altura;
		
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Dados: " + "\n Base do retângulo: " + this.getBase()  + "\n Altura do retângulo: " + 
				this.getAltura()  + "\n Área: " + format(this.getArea()) + "\n";
		
	}
	

}
