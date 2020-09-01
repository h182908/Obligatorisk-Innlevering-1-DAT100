package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave6 {
	
	public static void main(String[] args) {
		int n = 0;
		do
			n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number larger than 0"));
		while (n <= 0);
		
		System.out.println(n_factorial(n));
	}
	
	public static long n_factorial(long n) {
		for(int i = (int) n - 1; i > 0; i--)
			n = n * i;
		return n;
	}
}
