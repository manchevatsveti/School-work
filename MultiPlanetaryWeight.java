package eddu.smg;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double weight ;
		System.out.println("What is your weight on Earth?");
		weight = in.nextDouble();
		
		   String[] planets = {"Mercury", "Venus", "Mars", "Jupiter","Saturn","Uranus","Neptune"};
	        String planet = (String)JOptionPane.showInputDialog(null,
	                "Choose a planet ",
	                "MultiPlanetaryWeight",
	                2,
	                null,
	                planets,
	                planets[0]);
	        if (planet.equals("Mercury")){
	        	System.out.println ("Your weight on Mars"+ weight*0.38);
	        }
	        else {
	        	System.out.println ("Your weight on Mars");
	        }
	}

}
