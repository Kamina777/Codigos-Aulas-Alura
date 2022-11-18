package br.com.banco.Modelo;

import java.io.Serializable;

/**
 * 
 * @author Matheus;
 *
 */
public class Conta implements Comparable<Conta> , Serializable{

	protected double saldo;
	protected int agencia;
	protected int numero;
	protected Cliente titular;
	private static int total = 0;

	public Conta(Cliente titular, int agencia, int numero) {
		Conta.total++;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("O Saldo: " + this.saldo + ", Tentativa de saque: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object obj) {
		Conta outra = (Conta) obj;
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}

//	@Override
//	public int compareTo(Conta outra) {
////		return Double.compare(this.saldo,outra.saldo);
//		return 0;}

	@Override
	public int compareTo(Conta o) {
		return 0;
	}

//	@Override
//	public String toString() {
//		return "*******CONTA********" + "\nTitular: " + titular.getNome() +
//				"\nAgencia: " + agencia + "\nNumero da Conta: " + numero + 
//				"\nSaldo: R$" + saldo + 
//				"\n***********************";
//	}

}