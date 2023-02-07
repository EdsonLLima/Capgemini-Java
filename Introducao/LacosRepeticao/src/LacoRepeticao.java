import java.util.Iterator;

public class LacoRepeticao {

	public static void main(String[] args) {
		//Comando WHILE - laço pré-testado
		
		int quantidadeVezes = 1;
		System.out.println("Comando WHILE");
		while (quantidadeVezes <= 10) {
			System.out.println("Estou fazendo a " + quantidadeVezes + "ª vez");
			quantidadeVezes++; // quantidadeVezes = quantidadeVezes + 1
		}

		System.out.println("Sai do laço e executei "+ (quantidadeVezes - 1) + " vezes");
		
		
		//Do WHILE - laço pós-testado
		System.out.println("Comando DO...WHILE");
		quantidadeVezes = 1;
		do {
			System.out.println("Estou fazendo a " + quantidadeVezes + "ª vez");
			quantidadeVezes++; // quantidadeVezes = quantidadeVezes + 1
			
		}while(quantidadeVezes <= 10);
		System.out.println("Sai do laço e executei "+ (quantidadeVezes - 1) + " vezes");
		
		
		
		//For
		System.out.println("Comando FOR");
		int vezesQuantidade = 0;
		for (int quantidadeVezes1 = 1; quantidadeVezes1 <= 10; quantidadeVezes1++) {
			System.out.println("Estou fazendo a " + quantidadeVezes1 + "ª vez");	
			vezesQuantidade = quantidadeVezes1;
		}
		System.out.println("Sai do laço e executei "+ vezesQuantidade + " vezes");
		
		for (int quantidadeVezes1 = 1; quantidadeVezes1 <= 10; quantidadeVezes1++) {
			System.out.println("Estou fazendo a " + quantidadeVezes1 + "ª vez");	
			if (quantidadeVezes1 == 5) {
				System.out.println("Parei na " + quantidadeVezes1 + "ª vez");
				break;
			}
		}
	}

	
}
