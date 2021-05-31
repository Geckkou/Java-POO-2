package aula07_polimorfismo;

public class CD extends Produto{
	private String cantor;
	private String produtor;
	
	public CD(int codigo, String nome, double preco, double desconto_a_vista, String cantor, String produtor) {
		super(codigo, nome, preco, desconto_a_vista);
		this.cantor = cantor;
		this.produtor = produtor;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}
	
	
	public String descricao() {
		return "CD: " + toString();
	}

	@Override
	public String toString() {
		return "cantor = " + cantor + ", produtor = " + produtor + super.toString();
	}
	
	
	
	

}
