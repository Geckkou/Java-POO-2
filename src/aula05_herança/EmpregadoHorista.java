package aula05_herança;

public class EmpregadoHorista extends Empregado{
	
	private double valor_hora;
	private int numero_horas;

	public EmpregadoHorista(int codigo, String nome, double salario, double valor_hora, int numero_horas) {
		super(codigo, nome, salario);
		this.valor_hora = valor_hora;
		this.numero_horas = numero_horas;
		
	}
	
	
	public double getValor_hora() {
		return valor_hora;
	}


	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}


	public int getNumero_horas() {
		return numero_horas;
	}


	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}


	
	public double getSalario() {
		return this.valor_hora * this.numero_horas;
	}

}
