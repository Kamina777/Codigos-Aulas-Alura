package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteSerializacao3 {

	public static void main(String[] args) throws Exception {
		
//		Cliente cliente = new Cliente("Matheu Alves", "122-037-106-83", "Engenheiro");
//		System.out.println(cliente);
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente);
	
	}
}
