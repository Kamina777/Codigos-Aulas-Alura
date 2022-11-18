package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.banco.Modelo.Cliente;
import br.com.banco.Modelo.Conta;
import br.com.banco.Modelo.ContaCorrente;
import br.com.banco.Modelo.ContaPoupanca;

public class TesteUtil3 {

	public static void main(String[] args) {

		Cliente clienteCC1 = new Cliente("Nico", "12345678912", "Professor");
		Conta cc1 = new ContaCorrente(clienteCC1, 22, 33);
		cc1.deposita(333.0);

		Cliente clienteCC2 = new Cliente("Guilherme", "12396374100", "Faxineiro");
		Conta cc2 = new ContaPoupanca(clienteCC2, 22, 44);
		cc2.deposita(444.0);

		Cliente clienteCC3 = new Cliente("Paulo", "65485200", "CEO");
		Conta cc3 = new ContaCorrente(clienteCC3, 22, 11);
		cc3.deposita(111.0);

		Cliente clienteCC4 = new Cliente("Ana", "95175355", "Programador");
		Conta cc4 = new ContaPoupanca(clienteCC4, 22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		lista.forEach((conta) -> System.out.println(conta));

		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");

		Collections.sort(lista);

		lista.sort((c1,c2) -> Integer.compare(c1.getNumero(),c2.getNumero()));
		
		lista.forEach((conta) -> System.out.println(conta));

	}
}
//class TitularDaContaComparator implements Comparator<Conta>{
//
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		String nomeC1 = c1.getTitular().getNome();
//		String nomeC2 = c2.getTitular().getNome();
//		return nomeC1.compareTo(nomeC2);
//	}
//	
//}
//class NumeroDaContaComparator2 implements Comparator<Conta> {
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		
//		return c1.getNumero() - c2.getNumero();
//		
////		if (c1.getNumero() < c2.getNumero()) {
////			return -1;
////		}
////		if (c1.getNumero() > c2.getNumero()) {
////			return 1;
////		}
////		return 0;
//	}
//}