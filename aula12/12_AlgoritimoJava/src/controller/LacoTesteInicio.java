package controller;

import util.Teclado;

public class LacoTesteInicio {

	public static void main(String[] args) {
		int r, x, i;
		i = 1;
		x = Teclado.lerInt("Digite um n�mero: ");
		while (i <= 5) {
			r = x * 3;
			System.out.println(r);
			// i = i + i;
			i++;
		}
	}
}
