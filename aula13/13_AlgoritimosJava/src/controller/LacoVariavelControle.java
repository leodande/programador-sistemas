package controller;

import util.Teclado;

public class LacoVariavelControle {
	public static void main(String[] args) {

		int r, x, i;

		for (i = 1; i<=5; i++) {
			x = Teclado.lerInt("Digite um n�mero: ");
			r = x * 3;
			System.out.println(r);
		}
	}
}
