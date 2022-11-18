package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		conta1.saldo = 500;
		conta2.saldo = 500;
		System.out.println("O SALDO DA conta1 É: " + conta1.saldo);
		System.out.println("O SALDO DA conta2 É: " + conta2.saldo);
		conta1.deposita(100);
		System.out.println("O SALDO DA conta1 É: " + conta1.saldo);

		System.out.println("**************************");

		conta1.transfere(100, conta2);
		System.out.println("O SALDO DA conta1 É: " + conta1.saldo);
		System.out.println("O SALDO DA conta2 É: " + conta2.saldo);

	}
}
