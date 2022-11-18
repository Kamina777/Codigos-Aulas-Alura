
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("77777777777");
		nico.setSalario(3000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonicacao());
				
		
	}
}
