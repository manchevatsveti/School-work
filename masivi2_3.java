package eddu.smg;
import java.util.Scanner;
public class masivi2_3 {

	public static void main(String[] args) {
		final int NUMBER_STUDENTS = 3;
		final int NUMBER_QUESTIONS=3;
		char[][]answers = new char[NUMBER_STUDENTS][NUMBER_QUESTIONS];
		char [] keys = new char[NUMBER_QUESTIONS];
	
		Scanner in = new Scanner (System.in);
		
		for (int i=0; i<NUMBER_QUESTIONS;i++) {
			System.out.println("Enter answer for question " + (i+1));
			keys[i]= in.nextLine().charAt(0);
		}
		
		for(int i =0; i<NUMBER_STUDENTS;i++) {
			for(int j=0; j <NUMBER_QUESTIONS; j++) {
				System.out.println("Enter answer for quetion " + (j+1)+ " for student " + (i+1));
				answers[i][j]=in.nextLine().charAt(0);
			}
		}
		for(int i =0;i<NUMBER_STUDENTS;i++) {
			int points = 0;
			for(int j=0; j<NUMBER_QUESTIONS;j++) {
				if (answers[i][j]==keys[j]) {
					points++;
				}
			}
			System.out.println("Student" + (i+1)+ "'s points are" + points);
		}
	}
}
