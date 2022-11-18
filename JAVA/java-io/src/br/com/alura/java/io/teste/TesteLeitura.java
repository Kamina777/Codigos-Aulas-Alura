package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws Exception {
		//fluxo de entrada com um arquivo
		FileInputStream fis = new FileInputStream("Alura-IO-teste.txt"); //entrada do arquivo em bytes
		InputStreamReader isr = new InputStreamReader(fis); //transforma byts em caracteres
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}

}
