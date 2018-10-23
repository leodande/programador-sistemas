package model;

import model.Pessoa;

public class Cadastro {
	
	public static void main(String[] args) {
		Pessoa people = new Pessoa();
		
		people.setNome("Leandro Ferra");
		people.setIdade(28);
		people.setSexo("Masculino");
		
		System.out.println("Nome: " + people.getNome());
		System.out.println("Idade: " + people.getIdade());
		System.out.println("Sexo: " + people.getSexo());
		
	}
}
