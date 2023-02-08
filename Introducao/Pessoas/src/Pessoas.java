
public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fisica fiz = new Fisica();
		fiz.nome = "Mauricio";
		fiz.cpf = "11111111111";
		fiz.identidade = "15625478911";
		fiz.situacaoPessoa = "A";
		
		Juridica jur = new Juridica();
		jur.cnpj = "4546465464654";
		jur.nome = "Casa do Vidro";
		jur.inscEstadual = "46465454";
		jur.situacaoPessoa = "I";
		
		System.out.println("Dados da Pessoa Física");
		System.out.println( fiz.toString());
		System.out.println("Dados da Pessoa Juridica");
		System.out.println( jur.toString());

	}

}
