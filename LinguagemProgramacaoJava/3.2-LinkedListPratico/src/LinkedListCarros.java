import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		
		/*
		 * addFirst()
		 * addLast()
		 * removeFirst()
		 * removeLast()
		 * getFirst()
		 * getLast
		 * */

		 String carro;
		    LinkedList<String> cars = new LinkedList<>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    System.out.println(cars);		    
		    
		    // incluindo Mazda no inicio
		    cars.addFirst("Mazda");
		    System.out.println(cars);		    
		    
		    // Incluindo Bugatti no fim
		    cars.addLast("Bugatti");
		    System.out.println(cars);		    
		   
		    carro = cars.get(3);
		    System.out.println(carro);
		    		    
		    // removendo primeiro
		    cars.removeFirst();
		    System.out.println(cars);
		    
		 // removendo ultimo
		    cars.removeLast();
		    System.out.println(cars);
		    
		    // pega o primeiro
		    System.out.println(cars.getFirst());
		    System.out.println(cars);
		    
		    // pega o último
		    System.out.println(cars.getLast());
		    System.out.println(cars);

		    cars.clear();
		    if(cars.isEmpty()) {
		    	System.out.println("LinkedList vazio!");
		    }


	}

}
