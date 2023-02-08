
public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diaria de leite de um Elefante : " + mamifero1.cotaDiariaLeite());
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diaria de leite de um Elefante : " + mamifero2.cotaDiariaLeite());
	
	}

}
