package ZohoAssignment;
import java.util.Scanner;

public class CharDiff {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;) {
			if((c[i] - c[i+1]) == 1 || (c[i+1]-c[i] == 1) ) {
				System.out.println("Equal difference");
				break;
			}
			else {
				System.out.println("Unequal difference");
				break;
			}
		}
	}

}
