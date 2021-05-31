package aula03_IntroduçãoPOO;

public class Animal {
	private String especie;
	private int idade;
	private boolean vacinado;
	private double valor;
	private String descricao;
	
	//Construtor 
	public Animal(String especie, int idade, boolean vacinado, double valor, String descricao) {
		this.especie = especie;
		this.idade = idade;
		this.vacinado = vacinado;
		this.valor = valor;
		this.descricao = descricao;	
	}
	
	
	//Getters e Setters 
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public boolean getVacinado() {
		return this.vacinado;
	}
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}


	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

//to string
	@Override
	public String toString() {
		return "Animal: \n[especie = " + especie + 
				"\nidade = " + idade + 
				"\nvacinado = " + vacinado + 
				"\nvalor = " + valor
				+ "\ndescricao = " + descricao + "]";
	}
}
