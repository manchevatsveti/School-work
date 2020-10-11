package eddu.smg;
import java.util.Random;
public class masivi_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[20];
		
		
		for(int i=0; i<array.length; i++) {
		   Random rand = new Random(); //instance of random class
		     
		      array[i] = rand.nextInt(); 
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
