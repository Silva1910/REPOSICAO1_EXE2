package view;

public class Professor {

	private String nome ;
	private String matricula;
	private int idade ;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	public double calSalario() {
		System.out.println("escolha qual o tipo do professor");
		return -1;
	}
	
	

}
