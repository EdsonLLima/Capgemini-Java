

public class ComandoForEach {

	public static void main(String[] args) {
		//Vamos a um exemplo prático
		//eu vou criar um vetor, carregá-lo já inicializado em seguida vou 
		// ler os elementos do vetor usando um For Each
	
		int [] vetorNumeros = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		//varendo o vetor sem uso do ForEach
		
		System.out.println("Varrendo o vetor sem For Each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr : " + vetorNumeros[i]);			
		}
		
		//varendo o vetor usando do ForEach
		System.out.println("Varrendo o vetor com For Each");
		for (int listaNumeros : vetorNumeros) {
			System.out.println("Nr : " + listaNumeros);
		}
		

	}

}
