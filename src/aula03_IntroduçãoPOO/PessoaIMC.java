package aula03_IntroduçãoPOO;

public class PessoaIMC {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	//Construtor
	public PessoaIMC(String nome, int idade, double altura, double peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
public double imc() {
	return getPeso()/(Math.pow(getAltura(), 2));
	}

public String getCategoria() {
	if(imc() <= 18.5) {
		return "Abaixo do peso normal.";
	} else if((imc() > 18.5) &&(imc() <= 25)) {
		return "Peso normal.";
	}else if((imc() > 25) &&(imc() <= 30)) {
		return "Acima do peso normal.";
	}else {
		return "Obesidade";
	}
}

@Override
public String toString() {
	return "PessoaIMC: \n[Nome = " + nome + 
			"\nIdade = " + idade + 
			"\nAltura = " + altura + 
			"\nPeso = " + peso + 
			"\nSexo = " + sexo +
			"\nIMC = " + String.format("%.2f", imc()) + 
			"\nCategoria = " + getCategoria() + "]";
}
}
