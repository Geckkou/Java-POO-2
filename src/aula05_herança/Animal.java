package aula05_herança;

public class Animal {
	private String dono;
	private int nascimento;
	private int vacinacao;
	
	public Animal(String dono, int nascimento, int vacinacao) {
		super();
		this.dono = dono;
		this.nascimento = nascimento;
		this.vacinacao = vacinacao;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public int getVacinacao() {
		return vacinacao;
	}

	public void setVacinacao(int vacinacao) {
		this.vacinacao = vacinacao;
	}
	
	

}
