package br.com.banco.Modelo;
public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
