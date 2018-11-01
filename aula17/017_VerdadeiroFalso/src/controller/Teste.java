package controller;

public class Teste {

	public static void main(String[] args) {
		boolean b = false;
		boolean a = true;
		boolean c = a && !a;
		if (c) {
			System.out.println(c);
		} else {
			System.out.println("Diferentes");
		}
	}
}
