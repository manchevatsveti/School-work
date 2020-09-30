package eddu.smg;
import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {
   	 double average;
   	 int daysAbsent;
   	 Scanner reader = new Scanner(System.in);
   	 System.out.println("This program will determine if you can get out of the final exam.");
   	 System.out.println("Please answer the following questions.");
   	 System.out.println("What is your average in the class?");
   	 average = reader.nextDouble();
   	 System.out.println("How class lectures have you missed?");
   	 daysAbsent = reader.nextInt();
   	 if (average >= 90) {
   		switch (daysAbsent) {
   		case 0:
   		case 1:
   		case 2:
   		case 3: System.out.println("Congratulations! You are exempt from the final exam.");
   		break;
   		default : System.out.println("You are not exempt from the final exam.");
   		}
   	 } else if (average >= 80) {
   		switch (daysAbsent) {
   		case 0 : System.out.println("Congratulations! You are exempt from the final exam.");
   		break;
   		default: System.out.println("You are not exempt from the final exam.");
   		}
   	 }
   	 else
   		 System.out.println("You are not exempt from the final exam.");
    }
}

