
public class EditorDeVideo extends Funcionario {

	public double getBonicacao() {
		System.out.println("Chamando o método de bonificação do EDITOR DE VIDEO");
		return super.getBonicacao() + 100;
	}

}
