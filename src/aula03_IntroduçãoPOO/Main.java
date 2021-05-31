package aula03_IntroduçãoPOO;

public class Main {

	public static void main(String[] args) {
		Exercicio_classeEncapsulada n = new Exercicio_classeEncapsulada(154, "Gecko", 138.00);
		System.out.println("N�mero do pedido: " + n.getNumero());
		System.out.println("Nome do cliente: " + n.getNome());
		System.out.println("Valor do prudoto: " + n.getValor());
		
		System.out.println("-------------------------------------------------------------");
		
		
		Veiculo dados = new Veiculo("2ui13uh23hu",  "Torreto", "HB20", "Volksvagem", 3400.00);
		System.out.println("N�mero da placa: " + dados.getPlaca());
		System.out.println("Nome do dono: " + dados.getDono());
		System.out.println("Modelo do carro: " + dados.getModelo());
		System.out.println("Fabricante: " + dados.getFabricante());
		System.out.println("Valor de mercado: " + dados.getValor());
		
		System.out.println("---------------------------------------------------------------");
		
		Candidato candidato = new Candidato(55, "Bolbol", 13);
		candidato.votando(55);
		candidato.votando(55);
		System.out.println("N�mero do candidato: " + candidato.getNome());
		System.out.println("Nome do candidadto: " + candidato.getNome());
		System.out.println("Total de votos: " + candidato.getVotos());
		
		
		System.out.println("------------------------------------------------------------------");
		
		Locadora locadora = new Locadora("Ultimato", 49.80, 15.50);
		
		System.out.println("Nome do filme: " + locadora.getTitulo());
		System.out.println("Valor de venda: " + locadora.getVenda());
		System.out.println("Aluguel por 1 dia: " + locadora.getAluguel());
		System.out.println("Alugue por dias: " + locadora.getAluguelDevido(2));
		
		System.out.println("-----------------------------------------------------------------------");
		
		Candidato.arrayInput();
		
		System.out.println("-----------------------------------------------------------------------");
		Animal ani = new Animal("Gato", 2, true, 150.80, "Gato de rua, sem complica��es");
		System.out.println(ani.toString());
		

		System.out.println("-----------------------------------------------------------------------");
		Retangulo x = new Retangulo(2,3);
		System.out.println(x.toString());
		
		System.out.println("-----------------------------------------------------------------------");
		
		PessoaIMC pessoa = new PessoaIMC("Alexandre", 19, 1.73, 53, "m");
		System.out.println(pessoa.toString());
		
		System.out.println("-----------------------------------------------------------------------");
		double ad = FuncoesMath.adicionar(5, 4);
		double [] vet = {1,2,3,4,6,8};
		double med = FuncoesMath.media(vet); 
		boolean primo = FuncoesMath.isPrimo(3);
		System.out.println("Soma: " + ad);
		System.out.println("O n�mero � primo: " + primo);
		System.out.println("A m�dia dos valores �: " + med);
	}

}
