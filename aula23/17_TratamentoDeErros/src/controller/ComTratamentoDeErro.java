package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double a = Teclado.lerDouble("Digite o Númerador: ");
			double b = Teclado.lerDouble("Digite o Denominador: ");
			double c = a / b;
			System.out.println("Resultado da divisão de a por b: " + c);

		} catch (NumberFormatException nfe) {
			System.out.println("Caracter inválido! ");

		} catch (ArithmeticException ae) {
			System.out.println("Divisão por Zero");
		}
	}
}