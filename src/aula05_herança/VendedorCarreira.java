package aula05_herança;

public class VendedorCarreira extends Empregado{
	
	private double grat_tempo_serviço;
	private double grat_produtividade;
	private int numero_vendas;
	private int anos_serviço;
	
	public VendedorCarreira(int codigo, String nome, double salario, double grat_tempo_serviço,
			double grat_produtividade, int numero_vendas, int anos_serviço) {
		super(codigo, nome, salario);
		this.grat_tempo_serviço = grat_tempo_serviço;
		this.grat_produtividade = grat_produtividade;
		this.numero_vendas = numero_vendas;
		this.anos_serviço = anos_serviço;
	}
	
	public double getGrat_tempo_serviço() {
		return grat_tempo_serviço;
	}
	
	public void setGrat_tempo_serviço(double grat_tempo_serviço) {
		this.grat_tempo_serviço = grat_tempo_serviço;
	}
	
	public double getGrat_produtividade() {
		return grat_produtividade;
	}
	
	public void setGrat_produtividade(double grat_produtividade) {
		this.grat_produtividade = grat_produtividade;
	}
	
	public void setAnos_serviço(int anos)  {
		this.anos_serviço = anos;
	}
	

	public int getAnos_serviço() {
		return anos_serviço;
	}
	
	
	public int getNumero_vendas() {
		return numero_vendas;
	}
	
	public void setNumero_vendas(int numero_vendas) {
		this.numero_vendas = numero_vendas;
	}
	
	@Override
	public double getSalario()  {
		double salario = super.getSalario();
		return salario + numero_vendas*grat_produtividade + (this.anos_serviço/3)*grat_tempo_serviço;
	}
}
