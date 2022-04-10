package ZohoAssignment;
import java.util.Scanner;

public class PosiblePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputstring = scn.nextLine();
		System.out.println("Longest Palindrome is "+PosiblePalindrome.getPosiblePalindrome(inputstring));

	}
	 public static String getPosiblePalindrome(String inputstring) {
		 if(inputstring.isEmpty())
			 return"Enter proper String";
		 if(inputstring.length() == 1)
			 return inputstring;
		 
		 String longest = inputstring.substring(0,1);
		 
		 for(int i = 0; i< inputstring.length() ; i++) {
			 
		 
		 String temp = checkEquality(inputstring,i,i);
		 
		 if(longest.length() < temp.length()) {
			 longest = temp;
		 }
		 
		 temp = checkEquality(inputstring, i, i+1);
		 if(longest.length() < temp.length() ) {
		 longest = temp;
		 }
	 }
	 return longest
			 ;
    }
	
	 public static String checkEquality(String inputstring, int begin, int end) {
		 
		 while(begin >=0 && end <= inputstring.length() - 1 && inputstring.charAt(begin)== inputstring.charAt(end)) {
			  begin--;
			  end++;
		 }
		 return inputstring.substring(begin+1,end);
	 }

		
	 }



