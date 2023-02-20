package AulaAnnotation;

class DeprecatedTeste {
	void visulizar() {
		System.out.println("Método visualizacao");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrar que o método exibir é deprecated");
	}

}
