package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws Exception {
		
//		Socket s = new Socket(); //cria uma conexão rede
		
//		FLUXO DE ENTRADA------------------------------------------------
//		InputStream fis = System.in; // lê a entrada de dados do console
		InputStream fis = new FileInputStream("Alura-IO-teste.txt"); // lê a entrada de dados do arquivo
		Reader isr = new InputStreamReader(fis); // transforma byts em caracteres
		BufferedReader br = new BufferedReader(isr);

//		FLUXO DE SAÍDA-------------------------------------------------
		OutputStream fos = new FileOutputStream("Alura-IO-teste2"); //grava a saída no arquivo
//		OutputStream fos = System.out; // mostra a saída no console
//		OutputStream.fos = s.getInputStream(); //saída de rede
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
//			bw.flush(); //faz o buffer lançar 'imediatamente' o fluxo de arquivos
			linha = br.readLine();
		}
		br.close(); // fecha o reader
		bw.close(); // fecha o buffer
	}

}
