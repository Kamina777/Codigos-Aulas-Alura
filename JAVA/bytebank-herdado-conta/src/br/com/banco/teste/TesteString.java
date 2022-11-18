package br.com.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "     Alura      ";// object literal
		System.out.println(nome);
		String teste = nome.trim();
		int teste1 = teste.length();

		nome.replace("A", "a");
		System.out.println(teste);

		for (int i = 0; i < args.length; i++) {

		}
		
	}
}
