
public class TesteReferencia {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Matheus");
		g1.setSalario(3000.0);
		
		Funcionario f1 = new EditorDeVideo();
		f1.setNome("Barbara");
		f1.setSalario(2000.0);
		
		EditorDeVideo ed1 = new EditorDeVideo();
		ed1.setNome("Sarah");
		ed1.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ed1);
		
		System.out.println(controle.getSoma());
	}
}
