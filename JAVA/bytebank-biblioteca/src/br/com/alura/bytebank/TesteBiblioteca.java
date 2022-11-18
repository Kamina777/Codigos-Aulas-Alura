package br.com.alura.bytebank;

import br.com.banco.Modelo.Conta;
import br.com.banco.Modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(222,333);
		cc.deposita(300);
		System.out.println(cc.getSaldo());
	}
	main
}
