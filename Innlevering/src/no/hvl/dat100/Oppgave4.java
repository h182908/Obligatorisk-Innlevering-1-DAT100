package no.hvl.dat100;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Oppgave4 {

	public static void main(String[] args) {
		
		int income = Integer.parseInt(JOptionPane.showInputDialog("What is your income?"));
		
		double base_rate_tax = income*0.22;
		
		System.out.println("Brutto: " + income);
		System.out.println("Inntektsskatt: " + base_rate_tax + ", Trinnskatt: " + calculate_tax_bracket(income));
		System.out.println("Netto: " + (income - base_rate_tax - calculate_tax_bracket(income)));
		
	}
	
	public static double calculate_tax_bracket(int income) {
		
		int[] income_class = {180800, 254500, 639750, 999550, Integer.MAX_VALUE};
		double[] tax_class = {0.019, 0.042, 0.132, 0.162};
		double tax = 0;
		
		for(int i = 0 ; i < tax_class.length; i++) {
			if(income > income_class[i] && income > income_class[i + 1]) 
				tax += (income_class[i + 1] - income_class[i]) * tax_class[i];
			
			else if(income > income_class[i])
				tax += (income - income_class[i]) * tax_class[i];
		}
		return Math.round(tax);
	}
}