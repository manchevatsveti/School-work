package eddu.smg;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 7; i>0;i--) {
			for(int j =0;j<7; j++ ) {
				if(j<=7-i) {
					System.out.print(" " );	
					continue;
				}
				else {
				System.out.print("*" );
				}
			}
			System.out.print("\n" );
		}
	}

}
