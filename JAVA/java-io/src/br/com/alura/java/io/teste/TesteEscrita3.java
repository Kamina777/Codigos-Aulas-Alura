package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TesteEscrita3 {
	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter("Alura-IO-teste2"));
		bw.write("Sangatsu no lion");
		bw.newLine();
		bw.write("Non Non Byori");

		bw.close();
	}
}
