import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
		// construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();
        
        // adicionando Carros ao arraylist
        carros.add("FLUENCER");
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");
        carros.add("SANDERO");
        // mostra array
        System.out.println(carros);
        
     // substituir MERCEDES por MITSUBISHI
        carros.set(4,"MITSUBISHI");
        // mostra array
        System.out.println(carros);
        
     // remover VECTRA
        carros.remove("VECTRA");
        // mostra array
        System.out.println(carros);
        
     // adicionando Carros ao arraylist com JOPtionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        // mostra array
        System.out.println(carros);
        
        
     // esvaziando o array
        /*
        carros.clear();
        // mostra array
        System.out.println(carros);
        
        // verificar se o array está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }
        */
        
        if (carros.contains("BMW")) {
            // substituindo quando não se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))) {
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        } else {
        	System.out.println("Não encontrei o argumento pesquisado!");
        }
        // mostra array
        System.out.println(carros);
        
        
	}

}
