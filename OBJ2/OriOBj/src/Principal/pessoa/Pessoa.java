package Principal.pessoa;

public class Pessoa {
	
	
	// EMCAPSULAMENTO
	private String nome;
	private String CPF;
	private int idade;
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public int getIdade() {
		return this.idade;
	}

	//setters (DEFINIR)
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setCPF (String CPF) {
		this.CPF = CPF;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	//Getters (PEGAR)
	

}
