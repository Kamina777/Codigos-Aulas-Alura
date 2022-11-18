package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		// System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		// System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.agencia = "0142";
		segundaConta.numero = "38760213";
		segundaConta.saldo = 560;
		segundaConta.titular = "Matheus Alves Ferreira";

		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("Numero: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("titular: " + segundaConta.titular);
	}
}
