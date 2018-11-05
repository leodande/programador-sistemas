package model;

public class Professor extends Usuario {
	private int matriculaProfessor;
	private String nome;
	private String especialidade;

	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public Professor() {
		super();
	}
	
	public Professor(int matriculaProfessor, String nome, String especialidade) {
		super();
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Informe a matrícula do profesor: ");
		System.out.println("Login : " + super.getLogin());
		System.out.println("Nome: " + nome);
		
		System.out.println("Especialidade: " + especialidade);
		
	}

}
