package eddu.smg;
import java.util.Scanner;
public class ColorRange {
    public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double wavelength ;
		System.out.println("Enter a color code");
		wavelength = in.nextDouble();
		if (wavelength>380 && wavelength<450){
			System.out.println("The color is Violet");
		}
		else if (wavelength>451 && wavelength<495){
			System.out.println("The color is Blue");
		}else if (wavelength>496 && wavelength<570){
			System.out.println("The color is Green");
		}else if (wavelength>571 && wavelength<590){
			System.out.println("The color is Yellow");
		}else if (wavelength>591 && wavelength<620){
			System.out.println("The color is Orange");
		}else if (wavelength>621 && wavelength<750){
			System.out.println("The color is Red");
		}
		else {
			System.out.println("The entered wavelength is not a part of the visible spectrum");
		}
    }
}
