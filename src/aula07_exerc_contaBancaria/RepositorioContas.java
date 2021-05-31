package aula07_exerc_contaBancaria;

public interface RepositorioContas {
	
	
	public Conta procurar(String numero);
	public void inserir(Conta c);
	public boolean atualizar(Conta c);
	public boolean existe(String numero);
	public boolean remover(String numero);
}
