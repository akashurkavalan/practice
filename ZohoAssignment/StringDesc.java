package ZohoAssignment;
import java.util.*;

public class StringDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = new String[100];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of the string: ");
		int n = scn.nextInt();
		
		System.out.println("Enter the String1: ");
		String s1 = scn.next();
		
	    System.out.println("Enter the String2: ");
		String s2 = scn.next();
		
		char[]ch1 = s1.toCharArray();
		
		char[]ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		System.out.println("String1: ");
		for(int i = ch1.length-1; i>=0; i--)
		{
			System.out.print(ch1[i]);
		}
		Arrays.sort(ch2);
		System.out.println();
		System.out.println("String2: ");
		for(int i = ch2.length-1; i>=0; i--)
		{
			System.out.print(ch2[i]);
		}
		

	}

}
