package model;

public class Cachorro implements Animal {
	
	public String nome;
	
	public Cachorro(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String seuNome() {
		return nome;
	}
	
	@Override
	public String seuBarulho() {
		return "Au! Au!";
	}
	
}
