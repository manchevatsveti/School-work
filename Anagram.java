package eddu.smg;
import java.util.Scanner;
public class Anagram {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a word:");
		String word1 = in.nextLine();
		System.out.println("Enter a word:");
		String word2 = in.nextLine();
		in.close();
		
		boolean isAnAnagram = true;
		String copyWord2 = word2;
		int lengthWord1 = word1.length();
		
		for (int i = 0; i<lengthWord1; i++){
			char charInWord1 = word1.charAt(i);
			if(charInWord1 > 'a' && charInWord1 < 'z' || charInWord1 > 'A' && charInWord1 < 'Z'){
				int positionInWord2 = copyWord2.indexOf(charInWord1);
				if(positionInWord2 == -1){
					isAnAnagram = false;
					break;
				}else{
					copyWord2 = copyWord2.substring(0,positionInWord2)+ copyWord2.substring(positionInWord2 +1);
					System.out.println(copyWord2);
				}
			}
		}
	}
}
