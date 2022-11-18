package br.com.alura.java.io.teste;

import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws Exception {

//		BufferedWriter bw = new BufferedWriter(new FileWriter("Alura-IO-teste2"));

		PrintWriter ps= new PrintWriter(new File("aluraAula"));
//		PrintStream ps = new PrintStream(new File("aluraAula");
		ps.println("Sangatsu no lion");
		ps.println("Non Non Byori");
		
		ps.close();
	}
}
