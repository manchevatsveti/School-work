package eddu.smg;
import java.util.Scanner;
public class masivi2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		int maxSum = 0;
		int sum = 0; 
		int col=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				sum =+ matrix[i][j];
			}
			if(sum>maxSum) {
				maxSum =sum;
				col = i+1;
			}
			sum =0;
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("Column " +col+ " has the biggest sum");
	}

}
