package aula07_exerc_contaBancaria;

import java.util.Scanner;

public class RepositorioContaArray implements RepositorioContas{
	private Conta [] contas;
	private int indice;


	public RepositorioContaArray(int capacidade) {
		this.contas = new Conta [capacidade];
		this.indice = 0;
	}

	private int procurarIndice(String numero) {
		int i = 0;
		boolean achou;
		for (achou = false; !achou && i < indice;) {
			if (contas[i].getNumero().equals(numero)) {
				achou = true;
				break;
			} else {
				i++;
			}
		}
		if (!achou) 
			i = -1;
		return i;
	}  

	@Override
	public Conta procurar(String numero) {
		Conta c = null;

		int i = procurarIndice(numero);

		if(i == -1) {
			return null;
		} else {
			c = contas[i];
			return c;
		}
	}


	/*public void inserir(Conta c) {
		if(this.indice < this.contas.length) {
			this.contas[this.indice] = c;
			this.indice++;
		} else if(this.contas[this.indice].equals(c)) {
			throw new IllegalArgumentException("Essa conta ja existe");
		} else if(c == null) {
			throw new IllegalArgumentException("Essa conta está vazia");
		} else  if(this.indice > this.contas.length){
			throw new IllegalArgumentException("Vetor se encontra cheio");
		}
	}*/


	@Override
	public void inserir(Conta c) {
		if (indice < contas.length)  {
			if (c != null) {
				if ( procurar(c.getNumero()) == null)  {
					contas[indice] = c;
					indice = indice + 1;					}
				else
					System.out.println("conta já existe!");
			} 
			else  {
				System.out.println("Conta inválida");   }
		} // else
		System.out.println("Vetor cheio");  
	} 

	@Override
	public boolean atualizar(Conta c) {
		int i = procurarIndice(c.getNumero());

		if(i != -1) {
			contas[i] = c;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean existe(String numero) {
		return procurarIndice(numero) > -1;
	}
	
	@Override
	public boolean remover(String numero) {
		int pos  = procurarIndice(numero);
		
		if(!(pos >= 0 && pos < this.indice)) {
			System.out.println("Posição inválida");
		}
		
		for(int i = pos; i < this.indice - 1; i++) {
			this.contas[i] = this.contas[i + 1];
		}
		this.indice--;
		return true;
	}
}
