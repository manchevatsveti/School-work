package eddu.smg;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class masivi_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[10];
		for(int i =0; i<array.length; i++) {
			 array[i] = in.nextInt();
		}
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
