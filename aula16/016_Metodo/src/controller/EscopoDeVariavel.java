package controller;

public class EscopoDeVariavel {
	/**public static void main(String[] args) {
		int x = 5;
		System.out.println("'x' no início do main() é " + x);
	}**/

	static int x = 2; // Variável global

	public static void metodoA() {
		int x = 25;
		System.out.println("Variável local 'x' ao entrar no metodoA é " + x);
		System.out.println("");
		x = x + 1;
		System.out.println("Variável local 'x' antes de sair do metodoA é " + x);
		System.out.println("");
	}

	public static void main(String[] args) {
		metodoA();
		metodoB();
		System.out.println("");
		int x = 5;
		System.out.println("'x' no início de main() é " + x);
		System.out.println("");
		metodoA();
		metodoB();
		
	}
	
	public static void metodoB() {
		System.out.println("Variável 'x' ao entrar no metodoB é " + x + " global.");
		System.out.println("");
		x = x * 10;
		System.out.println("Variável 'x' antes de sair do metodoB é " + x);
	}
}
