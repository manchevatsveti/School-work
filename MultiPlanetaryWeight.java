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
	        	System.out.println ("Your weight on Mercury"+ weight*0.38);
	        }
	        else if (planet.equals("Venus")){
	        	System.out.println ("Your weight on Venus"+ weight*0.91);
	        }
	        else if (planet.equals("Mars")){
	        	System.out.println ("Your weight on Mars"+ weight*0.38);
	        }
	        else if (planet.equals("Jupiter")){
	        	System.out.println ("Your weight on Jupiter"+ weight*2.36);
	        }
	        else if (planet.equals("Saturn")){
	        	System.out.println ("Your weight on Saturn"+ weight*0.92);
	        }
	        else if (planet.equals("Uranus")){
	        	System.out.println ("Your weight on Uranus"+ weight*0.89);
	        }
	        else if (planet.equals("Neptune")){
	        	System.out.println ("Your weight on Neptune"+ weight*1.13);
	        }
	        
	}

}
