package aula03_IntroduçãoPOO;

public class Retangulo {
	private double base;
	private double altura;
	
	//Construtor none
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public double area() {
		return getBase() * getAltura();
	}
	
	public double perimetro() {
		return 2*(getBase() + getAltura());
	}
	
	
	//Getters e Setters
	public double getBase() {
		return this.base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
	//to string
	@Override
	public String toString() {
		return "Retangulo: \n[Base = " + base + 
				"\nAltura = " + altura +  
				"\nAr�a = " + area() + 
				"\nPer�metro = " + perimetro() + "]";
	}


	
	
	
	
	
	
	
}

	
