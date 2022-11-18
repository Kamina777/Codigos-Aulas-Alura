package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.banco.Modelo.Cliente;
import br.com.banco.Modelo.Conta;
import br.com.banco.Modelo.ContaCorrente;
import br.com.banco.Modelo.ContaPoupanca;

public class TesteUtil2 {

	public static void main(String[] args) {
		
		Cliente matheus = new Cliente("Matheus","12203710683","Programador");
		Cliente dayane = new Cliente("Dayane","77777777777","Estagiaria");	
		Cliente joao = new Cliente("Joao","78978978978","CO");
		Cliente vitor = new Cliente("Vitor","12235785267","Sustentacao");	

		Conta cc1 = new ContaCorrente(matheus, 22, 33);
		cc1.deposita(333.0);
		Conta cc2 = new ContaPoupanca(dayane,22, 44);
		cc2.deposita(444.0);
		Conta cc3 = new ContaCorrente(joao,22, 11);
		cc3.deposita(111.0);
		Conta cc4 = new ContaPoupanca(vitor,22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
//		
		for (Conta refConta : lista) {
			System.out.println(refConta);
		}
		System.out.println("------------------");
		NumeroDaContaComparator comparador = new NumeroDaContaComparator();
		lista.sort(comparador);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}

class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		if(o1.getNumero()<o2.getNumero()){
			return -1;
		}
		if(o1.getNumero() > o1.getNumero()) {
			return 1;
		}
		return 0;
	}
	
	
}