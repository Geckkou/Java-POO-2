package aula03_IntroduçãoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidato {
	private int numero;
	private String nome;
	private int votos;
	
	public Candidato() {}
	
	public Candidato(int numero, String nome, int votos) {
		this.numero = numero;
		this.nome = nome;
		this.votos = votos;
	}
	
	
	public int votando(int n) {
		int cont = 0;
		if(this.getNumero() == n) {
		 cont++;
		}
		return this.votos = this.getVotos()+ cont;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVotos() {
		return votos;
	}

	
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	@Override
	public String toString() {
		return "Candidato: \n[numero = " + numero + 
				"\nnome = " + nome + 
				"\nvotos = " + votos + 
				"\n-------------------------------" + "]";
	}
	
	
	
	public static void arrayInput() {
		boolean running = true;
		Scanner input = new Scanner(System.in);
		ArrayList<Candidato> candidato = new ArrayList<Candidato>();
		
		
		while(running) {
			Candidato c = new Candidato();
			System.out.println("Deseja cadastrar os candidatos [S/n] ?");
			String parada = input.next();
			
				if(parada.equalsIgnoreCase("n")) {
					System.out.println("Encerrando...");
					running = false;
					
					for(Candidato can : candidato) {
						System.out.println(can.toString());
					}
				}else {
					System.out.println("Digite o nome do candidato");
					c.setNome(input.next());
					input.nextLine();
					
					System.out.println("Digite o n�mero do candidato");
					c.setNumero(input.nextInt());
					
					System.out.println("Digite a quantidade de votos do candidato");
					c.setVotos(input.nextInt());
					
					candidato.add(c);
					
				}
		}

	}
	

}
