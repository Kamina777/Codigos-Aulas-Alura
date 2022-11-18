
public class Conta {
	private double saldo;
	private String agencia;
	private String numero;
	private Cliente titular;

	public Conta(String agencia, String numero, Cliente titular) {
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		// System.out.println("DEPOSITO DE " + valor + "R$ FEITO COM SUCESSO!!!");
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

	public double getSaldo() {
		return this.saldo;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
}
