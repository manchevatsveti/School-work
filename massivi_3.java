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
		for(int i=0; i<array.length; i++) {
			if (i>0) {
				array[i]= array[i-1];
			}
			else {
				array[i]=array[9];
			}
		}
			for(int i =0; i<array.length; i++) {
				System.out.print(array[i]);
		}
			
	}
}
