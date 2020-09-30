package eddu.smg;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		double height, length, width;
		 Scanner reader = new Scanner(System.in);
		 System.out.println("What is the height of the room?");
	   	 height = reader.nextDouble();
	   	 System.out.println("What is the lenght of the room?");
	   	 length = reader.nextDouble();
	   	 System.out.println("What is the width of the room?");
	   	 width = reader.nextDouble();
	   	 
	  double sqToPaint ;
	  sqToPaint =(width*length) + 2*(height*width)+ 2*(height*length);
	  double smallBucket,rest;
	  int bigBucket;
	  bigBucket = sqToPaint/140;
	  rest = sqToPaint%140;
	  smallBucket = rest/30;
	  
	  System.out.println((int)(bigBucket + smallBucket)+1);

	}

}
