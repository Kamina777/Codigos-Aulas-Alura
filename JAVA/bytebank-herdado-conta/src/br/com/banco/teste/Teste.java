package br.com.banco.teste;

import br.com.banco.Modelo.Cliente;
import br.com.banco.Modelo.ContaCorrente;
import br.com.banco.Modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		Cliente matheus = new Cliente("Matheus Alves","12203710683","Programador");
		Cliente dayane = new Cliente("Dayane Martins","77777777777","Engenheira");

		ContaCorrente ccMatheus = new ContaCorrente(matheus, 142, 36000);
		ContaCorrente ccDayane = new ContaCorrente(dayane, 145, 76000);

		guardador.adiociona(ccMatheus);
		guardador.adiociona(ccDayane);
		ccDayane.deposita(6000);
		ccMatheus.deposita(3000);

		System.out.println(guardador.getReferencia(0).getAgencia());
		System.out.println(ccDayane);

	}
}

