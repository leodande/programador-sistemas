package model;

public class Gato implements Animal {

public String nome;
	
	public Gato(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String seuNome() {
		return nome;
	}
	
	@Override
	public String seuBarulho() {
		return "Miau! Miau!";
	}
	
}

