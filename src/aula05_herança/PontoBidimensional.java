package aula05_herança;

public class PontoBidimensional {
	private double coordX;
	private double coordY;
	
	public PontoBidimensional(double coordX, double coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	public double getCoordX() {
		return this.coordX;
	}
	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return this.coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}

	@Override
	public String toString() {
		return "PontoBidimensional [coordX=" + coordX + ", coordY=" + coordY + "]";
	}
	
	

}
