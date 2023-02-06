
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Realcionais
		// > < <= >= != ==
		
		int num1, num2;
		
		//testando igualdade
		num1 = 10;
		num2 = 10;
		 
		if(num1 == num2) {
			System.out.println("Numero 1 e Numero 2 são iguais");
		}
		
		//testando diferença
		num1 = 10;
		num2 = 30;		 
		if(num1 != num2) {
			System.out.println("Numero 1 e Numero 2 são diferentes");
		}
		
		//testando maior QUE
		num1 = 10;
		num2 = 5;		 
		if(num1 > num2) {
			System.out.println("Numero 1 é maior que o numero 2");
		}else {
			System.out.println("Numero 2 é no minimo igual ou maior que o numero 1");
		}	
		
		
		// Operadores lógicos
		// && = e / AND || = ou / OR
		
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		
		if((num1 > num3) && (num2 == num4)){
			System.out.println("Primeira  opção satisfeita");
		}else {
			System.out.println("Segunda opção satisfeita!");
		}
		
		
		num2 = 10;
		if((num1 > num3) || (num2 == num4)){
			System.out.println("Primeira  opção satisfeita");
		}else {
			System.out.println("Segunda opção satisfeita!");
		}
		
		
	
	}

}
