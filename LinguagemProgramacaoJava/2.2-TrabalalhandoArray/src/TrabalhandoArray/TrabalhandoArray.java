package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		// Declarando o array de paises
		//String [] paises = new String[4];
		//Declarando o array de numeros
		int [] numeros = new int[10];
		
		/*
		// abastecendo o array de paises
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país");			
		} 
		
		//listando o array de paises
		for (String listaPaises : paises) {
			System.out.println(listaPaises);			
		}
		*/
		//abastecendo o array de numeros
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		}
		
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);			
		}
		
		int novoValor = 11;
		numeros[8] = novoValor + 4;
		
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);			
		}

	}

}
