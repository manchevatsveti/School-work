package eddu.smg;
import java.util.Scanner;
import java.util.Random;
public class craps {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[]dice1 ={1,2,3,4,5,6};
		int[]dice2 ={1,2,3,4,5,6};
		int sum1, sum2;
	
		sum1 = mix()+ mix();
		
		System.out.println (sum1);

	}
	public static int mix(){
		Random random = new Random();
		int rand = 0;
		while (true){
		    rand = random.nextInt(7);
		    if(rand !=0) break;
		}
		return rand;
	}
	
}
