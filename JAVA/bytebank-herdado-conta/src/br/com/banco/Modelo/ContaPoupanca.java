package br.com.banco.Modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}

	@Override
	public String toString() {
		return "*******CONTA********" + "\nTitular: " + titular.getNome() + "\nAg: " + agencia + " C/P: " + numero
				+ "\nSaldo: R$" + saldo + "\n***********************";
	}
}