package aula07_exerc_contaBancaria;

public class Conta {
	private String numero;
	private String nome;
	private double saldo;
	
	
	
	public Conta(String numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero = " + numero + ", nome = " + nome + ", saldo = " + saldo + "]";
	}
	
	
	
}
