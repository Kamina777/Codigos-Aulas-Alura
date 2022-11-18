

public class Conta {
	private double saldo;
	private String agencia;
	private String numero;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
		//System.out.println("DEPOSITO DE " + valor + "R$ FEITO COM SUCESSO!!!");
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("OPERAÇÃO FEITA COM SUCESSO!!!");
			return true;
		} else {
			System.out.println("SALDO INSUFICIENTE!!!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.deposita(valor);
			this.saldo -= valor;

			System.out.println("OPERAÇÃO FEITA COM SUCESSO!!!");
			return true;
		} else {
			System.out.println("SALDO INSUFICIENTE!!!");
			return false;
		}
	}
}
