
public class TesteGerente {
	public static void main(String[] args) {
		Cliente xxx = new Cliente();
		xxx.setSenha(111);

		SistemaInterno si = new SistemaInterno();
		
		si.autentica(xxx);
	}
}
