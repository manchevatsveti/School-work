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
	   	 
	  double sqToPaintD ;
	  sqToPaintD =(width*length) + 2*(height*width)+ 2*(height*length);
	  int bigBucket,smallBucket = 0,rest;
	  int sqToPaint = (int)Math.ceil(sqToPaintD);
	  bigBucket = sqToPaint/140;

	  rest = sqToPaint%140;
	  if(rest > 90){
		  bigBucket++;
	  }else{
		    double smallBucketD = rest/30.0;
		    smallBucket = (int) Math.ceil(smallBucketD);
	  }
	
	  
	  System.out.println( "Big " + bigBucket + "small " + smallBucket );

	}

}
