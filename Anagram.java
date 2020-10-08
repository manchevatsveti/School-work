package eddu.smg;
import java.util.Scanner;
package eddu.smg;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a word:");
		String word1 = in.nextLine();
		System.out.println("Enter a word:");
		String word2 = in.nextLine();
		in.close();
		
		boolean isAnAnagram = false;
		
		word1 = word1.replaceAll("\\s+", "");
		word2 = word2.replaceAll("\\s+", "");
		
		 
		char sorted1[] = word1.toCharArray();
	      Arrays.sort(sorted1);
	      word1 = new String(sorted1);
	      
	      char sorted2[] = word2.toCharArray();
	      Arrays.sort(sorted2);
	      word2 = new String(sorted2);
	      
	      if(word1.equals(word2)) {
	    	  isAnAnagram = true;}
	      System.out.println(isAnAnagram ? "is anagram" : "isn't an anagram");
	}
}
