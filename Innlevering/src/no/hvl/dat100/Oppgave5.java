package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave5 {

	public static void main(String[] args) {
		read_n_scores(10);
	}
	
	public static void read_n_scores(Integer n) {
		for(int i = 0; i < n; i++) {
			int score = 0;
			
			do {
				if(score == 0) {
					score = Integer.parseInt(
							JOptionPane.showInputDialog("What is your score? (Only values between 0 and 100 are valid)"));
				} 
				else {
					score = Integer.parseInt(
							JOptionPane.showInputDialog("You entered an incorrect score, please enter a score between 0 and 100."));
				}
			} while (score < 0 || score > 100);
			
			System.out.println(get_grade(score));
		}
	}
	
	public static Character get_grade(int score) {
		
		int[] ranges = {0, 40, 50, 60, 80, 90};
		char[] grades = {'F', 'E', 'D', 'C', 'B', 'A'};
		char grade = 'G';
		
		for(int i = 0 ; i < ranges.length; i++) {
			if(score >= ranges[i])
				grade = grades[i];
		}
		return grade;
	}
}