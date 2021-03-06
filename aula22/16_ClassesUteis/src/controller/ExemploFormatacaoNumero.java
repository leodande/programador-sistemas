package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {

	public static void main(String[] args) {

		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem formatação: " + valor);
		System.out.println("Formatação: " + f.format(valor));
		System.out.println("==================================");

		NumberFormat p = NumberFormat.getPercentInstance();
		double porcento = 0.05;
		System.out.println("Sem formatação: " + porcento);
		System.out.println("Formatação: " + p.format(porcento));
		System.out.println("==================================");

		NumberFormat n = NumberFormat.getNumberInstance();
		double numero = 100.50;
		System.out.println("Sem formatação: " + numero);
		System.out.println("Formatação: " + n.format(numero));
		System.out.println("==================================");

		double valor2 = 12000.5;

		DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		System.out.println("Sem formatação: " + valor2);
		System.out.println("Formatação: " + df.format(valor2));

	}

}
