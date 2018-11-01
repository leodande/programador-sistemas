package controller;

public class EscopoDeVariavel {
	/**public static void main(String[] args) {
		int x = 5;
		System.out.println("'x' no in�cio do main() � " + x);
	}**/

	static int x = 2; // Vari�vel global

	public static void metodoA() {
		int x = 25;
		System.out.println("Vari�vel local 'x' ao entrar no metodoA � " + x);
		System.out.println("");
		x = x + 1;
		System.out.println("Vari�vel local 'x' antes de sair do metodoA � " + x);
		System.out.println("");
	}

	public static void main(String[] args) {
		metodoA();
		metodoB();
		System.out.println("");
		int x = 5;
		System.out.println("'x' no in�cio de main() � " + x);
		System.out.println("");
		metodoA();
		metodoB();
		
	}
	
	public static void metodoB() {
		System.out.println("Vari�vel 'x' ao entrar no metodoB � " + x + " global.");
		System.out.println("");
		x = x * 10;
		System.out.println("Vari�vel 'x' antes de sair do metodoB � " + x);
	}
}
