package controller;

import util.Teclado;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {

		int a, b, x;
		a= Teclado.lerInt("Informe o primeiro n�mero : ");
		b = Teclado.lerInt("Informe o segundo n�mero : ");
		x = a + b;
		if (x >10) {

			System.out.println("O resultado acrescido de 5 � " + (x + 5));
		}else {
			System.out.println("O resultado subtra�do de 7 � " + (x - 7));
		}
	}
}
