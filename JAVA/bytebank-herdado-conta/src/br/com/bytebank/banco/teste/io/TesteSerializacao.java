package br.com.bytebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.banco.Modelo.Cliente;
import br.com.banco.Modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws Exception, IOException {
		
		Cliente matheus = new Cliente("Matheu Alves", "122-037-106-83", "Engenheiro");
//		System.out.println(matheus);
		
		ContaCorrente cc = new ContaCorrente(matheus, 142, 360014);
		cc.deposita(9000); 
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ContaCorrente.bin"));
		oos.writeObject(cc);
		oos.close();
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente);
		
	}
}
