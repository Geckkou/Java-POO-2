package aula05_herança;

public class PontoTridimensional extends PontoBidimensional {
	private double coordZ;
	
	public PontoTridimensional(double coordZ, double coordX, double coordY) {
		super(coordX, coordY);
		this.coordZ = coordZ;
	}
	
	public double getCoordZ() {
		return this.coordZ;
	}
	public void setCoordZ(double coordZ) {
		this.coordZ = coordZ;
	}

	@Override
	public String toString() {
		return "PontoTridimensional [coordZ = " + coordZ + 
									  "\n" + super.toString() + "]";
	}
	
	

}
