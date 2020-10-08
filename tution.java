package eddu.smg;

public class tution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000, sum=0, tax;
		int rtax;
		for(int i=1; i<11; i++) {
			tax = tuition*0.06*100;
			rtax =(int)Math.round(tax);
			tuition = rtax/100.0+ tuition;
		}
		for(int i=1; i<5; i++) {
			tax = tuition*0.06*100;
			rtax =(int)Math.round(tax);
			tuition = rtax/100.0+ tuition;
			sum += tuition;
		}
		System.out.println("Tuition after 10 years :" +tuition);
		System.out.println("Sum of tuition for 4 years :" + sum);
	}

}
