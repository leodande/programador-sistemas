package controller;

import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Teclado.lerDouble("Digite o N�merador: ");
		double b = Teclado.lerDouble("Digite o Denominador: ");
		double c = a / b;
		System.out.println("Resultado da divis�o de a por b: " + c);

	}

}
