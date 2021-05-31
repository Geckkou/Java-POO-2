package aula07_exerc_contaBancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		RepositorioContaArray lista =  new RepositorioContaArray(20);

		int opcao = 1;

		while(opcao != 9) {

			opcao = obterOpcaoMenu(s);
			
			switch(opcao) {
			case 1:
				inserirConta(s, lista);
				break;
				
			case 2:
				consultarConta(s, lista);
				break;
				
			case 3:
				alterarConta(s, lista);
				break;
				
			case 4:
				removerConta(s, lista);
				break;

			case 9:
				System.out.println("Usuário digitou 9, sistema encerrado !");
				break;
			}

		}

	}
	
	private static void removerConta(Scanner scan, RepositorioContaArray lista) {
		String numero = leInformacao("Informe o número da conta para remove-lá", scan);
		
		try {
			lista.remover(numero);
			
			System.out.println("Conta excluida !");
		} catch (Exception e) {
			System.out.println("Opção inválida !");
		}
	}
	
	private static void alterarConta(Scanner scan, RepositorioContaArray lista) {
		System.out.println("Atualizando uma conta: ");
		
		double saldo = 0;
		
		System.out.println("Atualizando uma conta, informe os dados:");
		String numero = leInformacao("Informe o numero da conta: ", scan);
		String nome = leInformacao("Informe o nome do dono: ", scan);
		String entrada = leInformacao("Informe o saldo da conta", scan);
		
		saldo = Double.parseDouble(entrada); 
		
		Conta conta= new Conta(numero, nome, saldo);
		
		if(lista.atualizar(conta)) {
			System.out.println("Conta atualizada !");
			System.out.println(conta);
		} else {
			System.out.println("Conta não existe");
		}
		
	}
	
	private static void inserirConta(Scanner scan, RepositorioContaArray lista) {
		double saldo = 0;
		
		System.out.println("Criando uma conta, informe os dados:");
		String numero = leInformacao("Informe o numero da conta: ", scan);
		String nome = leInformacao("Informe o nome do dono: ", scan);
		String entrada = leInformacao("Informe o saldo da conta", scan);
		
		saldo = Double.parseDouble(entrada); 
		
		Conta conta = new Conta(numero, nome, saldo);
		
		lista.inserir(conta);
		
		System.out.println("Conta adicionada !");
		System.out.println(conta);

		
	}
	
	private static void consultarConta(Scanner scan,RepositorioContaArray lista) {
		System.out.println("Informe o número da conta: ");
		String numero = scan.nextLine();
		
		try {
			Conta conta = lista.procurar(numero);
			
			if(conta != null) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println("Número da Conta: " + conta.getNumero());
				System.out.println("Nome do Cliente: " + conta.getNome());
				System.out.println("Saldo da Conta: " + " R$ "+ conta.getSaldo());
			} else {
				System.out.println("Conta não localizada");
			}

		} catch (Exception e) {
			System.out.println("Opção inválida !");
		}
	}
	
	protected static String leInformacao(String msg, Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}
	
	protected static int obterOpcaoMenu(Scanner s) {

		boolean valid = false;
		int opcao = 0;
		String entrada;

		while(!valid) {

			System.out.println("\nInforme a opção desejada: \n");
			System.out.println("1: Cadastrar Conta");
			System.out.println("2: Consultar Conta");
			System.out.println("3: Alterar Conta");
			System.out.println("4: Remover Conta");
			System.out.println("9: Sair do Sistema");

			try {
				entrada = s.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >= 1 && opcao <= 4) {
					valid = true;
					System.out.println("Sua opção: " + opcao);
				} else if(opcao == 9) {
					System.out.println("Sua opção: " + opcao);
					valid = true;
				} else {
					System.out.println("Entrada inválida, digite novamente");
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}
		return opcao;
	}

}
