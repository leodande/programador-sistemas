package model;

import model.Aluno;
import model.Professor;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("João Mendes Silva", "10099876-5", "035568843-06", "21-87553456",
				"jmendes_silva@gmail.com", "10001", "Técnico de TI");

		Professor professor = new Professor(" Liércio Gomes Torto", "12369855-2", "082344789-12", "21938192156",
				"liercio_g@gmail.com", "9077", "Técnico de Informática");
	}

}
