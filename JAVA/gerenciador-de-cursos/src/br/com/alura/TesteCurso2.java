package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo");

		javaColecoes.adiciona(new Aula("Teste 2 teste", 11));
		javaColecoes.adiciona(new Aula("Teste 3 teste", 22));
		javaColecoes.adiciona(new Aula("Teste 1 teste", 33));
		javaColecoes.adiciona(new Aula("Teste 4 teste", 44));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		

	}
}
