package eddu.smg;
import java.util.Scanner;
public class integerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer;
		 Scanner reader = new Scanner(System.in);
		 integer = reader.nextInt();
		 while(integer>0) {
				for(int j =integer;j>0; j-- ) {
						System.out.print(j );	
				}
					
					for(int k =2;k<=integer;k++) {
					System.out.print(k );
					}
					integer--;
					System.out.print("\n" );
				}
				
			}

	}


