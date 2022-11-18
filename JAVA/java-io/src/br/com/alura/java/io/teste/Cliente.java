package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 6304810090140005569L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "*****CLIENTE****"+
				"\nTitular: "+this.nome+
				"\nCPF: " + this.cpf +
				"\nProfissão: " +this.profissao+
				"\n*******************";
	}
}
