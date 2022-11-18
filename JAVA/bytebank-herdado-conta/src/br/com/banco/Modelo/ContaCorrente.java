package br.com.banco.Modelo;

public class ContaCorrente extends Conta implements Tributavel{

//	private static final long serialVersionUID = 1L;
	
	public ContaCorrente(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	@Override
	public String toString() {
		return "*******CONTA********" + "\nTitular: " + titular.getNome() +
				"\nAg: " + agencia + " C/C: " + numero + 
				"\nSaldo: R$" + saldo + 
				"\n***********************";
	}

}
