package aula04_encapsulamento;

public class ContaBancaria {
	private int codigo;
	private double saldo;
	
	//construtor
	public ContaBancaria(int codigo, double saldo) {
		this.codigo = codigo;
		
		if(saldo <0)this.saldo = 0;
		else this.saldo = saldo;
	}
	
	//metodos
	public double sacar(double valor) {
		if (valor > this.saldo) sacar(saldo);
		this.saldo = 0;
		return valor;
	}
	
	
	public void imprimirSaldo() {
		System.out.println("Conta: " + codigo + " Saldo: R$ " + saldo);
	}
	
	public double creditarValor(int valor) {
		return this.saldo+=valor;
	}
	
	public double debitarValor(double valor) {
		if (valor > this.saldo) {
			valor = this.saldo;
			this.saldo -= valor;
		}
		return valor;
	}

}
