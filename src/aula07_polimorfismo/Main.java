package aula07_polimorfismo;

public class Main {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[3];
		produtos[0] = new CD(123, "Mantra", 60, 10, "Gecko", "Jordan");
		produtos[1]= new Livro(23, "The witcher", 80, 10, "Andrzej", "martinsfontes");
		produtos[2] = new Produto(4, "TV", 2300, 20);
		

		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}

	}

}
