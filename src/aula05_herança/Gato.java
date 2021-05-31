package aula05_herança;

public class Gato extends Animal{

	private boolean vacinado;
	private String descricao;
	
	public Gato(String dono, int nascimento, int vacinacao, boolean vacinado, String descricao) {
		super(dono, nascimento, vacinacao);
		this.vacinado = vacinado;
		this.descricao = descricao;
	}

	public boolean getVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
