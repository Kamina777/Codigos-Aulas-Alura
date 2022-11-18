package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws Exception {
		OutputStream fos = new FileOutputStream("Alura-IO-teste2");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Sangatsu no lion");
		bw.newLine();
		bw.newLine();
		bw.write("Non Non Byori");
		
		bw.close();
	}
}
