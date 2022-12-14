package br.com.alura;

public class TestaCursoAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo");

		javaColecoes.adiciona(new Aula("Teste 2 teste", 11));
		javaColecoes.adiciona(new Aula("Teste 3 teste", 22));
		javaColecoes.adiciona(new Aula("Teste 1 teste", 33));
		javaColecoes.adiciona(new Aula("Teste 4 teste", 44));
		
		Aluno a1 = new Aluno("AlunoTeste1", 111);
		Aluno a2 = new Aluno("AlunoTeste2", 222);
		Aluno a3 = new Aluno("AlunoTeste3", 333);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
	}
}
