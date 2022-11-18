package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaSet {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("aaaaaaaaaa");
		alunos.add("bbbbbbbbbb");
		alunos.add("dddddddddd");
		alunos.add("cccccccccc");
		alunos.add("eeeeeeeeee");
		
		String consultaNoSet = "bbbbbbbbbb";
		boolean consulta = alunos.contains(consultaNoSet);
		System.out.println("O ALUNO " + consultaNoSet + " TÁ NA LISTA? "+consulta);
		
		System.out.println("TAMANHO DO SET: " + alunos.size());
		
		for (String aluno : alunos) {
			System.out.println("ALUNO: " + aluno);
		}
		
	}
}
