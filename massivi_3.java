package eddu.smg;

import java.util.Scanner;

public class massivi_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] array = new int[10];
		for(int i =0; i<array.length; i++) {
			 array[i] = in.nextInt();
		}
		in.close();
		int temp = array[0];
		for(int i=0; i<array.length-1; i++) {
				array[i]= array[i+1];
		}
		array[9]=temp;
			for(int i =0; i<array.length; i++) {
				System.out.print(array[i]);
		}
			
	}
}

