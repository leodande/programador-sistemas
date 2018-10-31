package model;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String curso;
	private static int numStudents = 0; 
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public static int getNumAlunos() {
		return numStudents;		
	}
	public Aluno() {
		super();
	}
	public Aluno(String nome, String rg, String cpf, String telefone, String email, String matricula, String segmento) {
		super(nome, rg, cpf, telefone, email);
		this.matricula = matricula;
		this.curso = segmento;
	}
}