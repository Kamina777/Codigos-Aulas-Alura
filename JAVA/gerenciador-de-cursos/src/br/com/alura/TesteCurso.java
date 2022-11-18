package br.com.alura;

public class TesteCurso {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo");

		javaColecoes.adiciona(new Aula("Teste teste teste", 134124));
		
		System.out.println(javaColecoes.getAulas());
		
	}
}
