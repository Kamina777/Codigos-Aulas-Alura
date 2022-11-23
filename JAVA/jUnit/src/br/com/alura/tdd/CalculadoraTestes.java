package br.com.alura.tdd;

public class CalculadoraTestes {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		GeradorRandomNumber numeroAleatorio = new GeradorRandomNumber();
		
		for (int i = 0; i < 1000; i++) {
			double n1 = numeroAleatorio.RandomNumber();
			double n2 = numeroAleatorio.RandomNumber();
			System.out.println(i + ": " + n1 + " + " + n2+ " = " + calc.somar(n1, n2));
		}
	}
}
