package controller;

import util.Teclado;

public class ComTratamentoDeErroTentativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int maxTries = 3;
		while (true) {

			try {
				double a = Teclado.lerDouble("Digite o Númerador: ");
				double b = Teclado.lerDouble("Digite o Denominador: ");
				double c = a / b;
				System.out.println("Resultado da divisão de a por b: " + c);
				System.exit(0);
			} catch (NumberFormatException nfe) {
				System.out.println("Caracter inválido! ");
				if (++count == maxTries) {

					System.out.println("Número de tentativas excedido");
					System.exit(1);
				} else {
					continue;
				}
			}
		}
	}
}
