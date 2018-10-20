package controller;

public class SobrecargaMetodo {
	int idade;
	String nome;
		
	public void cadastrarPessoa (int valor) {
		idade = valor;
		System.out.println("Idade: " + idade);
	}
	
	public void cadastrarPessoa (int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + " - Nome: " + nome);
	}
	
	public static void main(String[] args) {
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(38);
		//scm.cadastrarPessoa("Jhon Lennon");
		scm.cadastrarPessoa(37, "Leonardo Dande");
	}
	
	//public void cadastrarPessoa(int valor) {
		
	//}
	
	
}
