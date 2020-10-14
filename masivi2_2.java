package eddu.smg;
import java.util.Scanner;
public class masivi2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 int[][] array = new int[10][10];
		  int rowsN, columnsN;
		  System.out.println( "Rows?");
		   rowsN = in.nextInt();
		  System.out.println("Columns?");
		 columnsN = in.nextInt();
		  
		 
		  for (int i = 0; i < rowsN; i++) { 
				for (int j = 0; j < columnsN; j++) { 
					System.out.println("Element at arr[" + i + "][" + j + "] = ? " ); 
					array[i][j] = in.nextInt(); 
				} 
			} 
		  in.close();
		  System.out.println("Transpose:");
			for (int i = 0; i < columnsN; i++) {
				for (int j = 0; j < rowsN; j++) { 
				System.out.print(array[j][i]+ " ");
				} 
				System.out.println(" ");;
			} 
	}

}
