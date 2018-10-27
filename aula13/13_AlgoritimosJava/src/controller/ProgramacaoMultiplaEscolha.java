package controller;

import util.Teclado;

public class ProgramacaoMultiplaEscolha {

	public static void main(String[] args) {

		int matr, numFinal;

		matr = Teclado.lerInt("Informe a matrícula: ");
		numFinal = matr % 10;
			System.out.println(numFinal);
			
		switch (numFinal) {
		case 0:
			System.out.println("Pagamento em Janeiro");
			break;
		case 1:
			System.out.println("Pagamento em fevereiro");
			break;			
		case 2:
			System.out.println("Pagamento em Março");
			break;
		case 3:
			System.out.println("Pagamento em Abril");
			break;
		default:
			System.out.println("Pagamento em maio");
		}
	}

}
