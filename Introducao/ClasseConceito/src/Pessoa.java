
public class Pessoa {
	
	private String nomePessoa; //atributos
	private int idadePessoa; //atributos
	
	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", idadePessoa=" + idadePessoa + "]";
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public int getIdadePessoa() {
		return idadePessoa;
	}
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
	
	
	
	
	
	
	
	//metodos
	/*public void mostraDados(String pNome, int pIdade) {;
	System.out.println("Nome : " + pNome);
	System.out.println("Idade : " + pIdade);
	}
	*/
	

}
