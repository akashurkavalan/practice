package ZohoAssignment;
import java.util.Scanner;
import java.lang.Math;

public class Pattern {
	public static void printPattern(int n) {
		int size = 2 * n - 1;
		for (int i=1; i<= size; i++) {
			for (int j=1; j<= size; j++) {
			System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
		}
			System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n = scn.nextInt();
      System.out.println();
      printPattern(n);
	}

}
