package br.com.alura.tdd;

import java.util.Random;

public class GeradorRandomNumber {
	Random rand = new Random();
	double max = 20;
	double min = -20;
	
	public double RandomNumber() {
		return Math.floor(Math.random()*(max-min+1)+min);

	}
}
