package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.banco.Modelo.Cliente;
import br.com.banco.Modelo.Conta;
import br.com.banco.Modelo.ContaCorrente;

public class TesteUtil {
	public static void main(String[] args) {
		ArrayList<Conta> listaContas = new ArrayList<Conta> ();
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente matheus = new Cliente("Matheus Alves","12203710683","Programador");
		Cliente dayane = new Cliente("Dayane Martins","77777777777","Engenheira");
		listaClientes.add(matheus);
		listaClientes.add(dayane);
		
		ContaCorrente ccMatheus = new ContaCorrente(matheus, 142, 36000);
		ContaCorrente ccDayane = new ContaCorrente(dayane, 145, 76000);
		listaContas.add(ccMatheus);
		listaContas.add(ccDayane);
		
		ccDayane.deposita(6000);
		ccMatheus.deposita(3000);

		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
		for (Object object : listaContas) {
			System.out.println(object);
		}
	}
}
