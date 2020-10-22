package eddu.smg;
import java.util.Scanner;
import java.util.Random;
public class craps {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int dice1, dice2;
		int sum1=0, sum=0;
	
		dice1 = mix();
		dice2 = mix();
		sum1 = dice1 +dice2;
		System.out.println ("You rolled "+ dice1+" and "+ dice2  );
		System.out.println ("Your point is  "+ sum1  );
		if(sum1==2 || sum1==3 || sum1==12){
			System.out.println("You lose");
			}
		else if(sum1==7 || sum1 ==11){
			System.out.println("You win");
			
		}
		else{
		while(sum!=7 ){
			dice1 = mix();
			dice2 = mix();
			sum = dice1 +dice2;
			System.out.println ("You rolled "+ dice1+" and "+ dice2  );
			System.out.println ("Your point is  "+ sum  );
			if(sum==sum1){
				System.out.println("You win ");
			}
		}
		if(sum==7){
			System.out.println("You lose ");
		}
	  }
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
