package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.banco.Modelo.ContaCorrente;

public class TesteDeSerializacao {
	public static void main(String[] args) throws Exception, IOException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ContaCorrente.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc);
	}
}
