package model;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Michel Oliveira", "0001", "123456", 250);
		System.out.println("Saldo Michel");
		System.out.println(cc.calcularSaldo());
		
		ContaEspecial cce = new ContaEspecial("Fabr�cio Curvello", "0034", "987654", 0.20,500);
		System.out.println("Saldo Fabr�cio");
		System.out.println(cce.calcularSaldo());
	}
}
