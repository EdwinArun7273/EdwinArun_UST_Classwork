package Day4Programs;

import java.util.Scanner;

public class p1_exeptionHandling {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first number: ");
			a = sc.nextInt();
			System.out.println("Enter the second number: ");
			b = sc.nextInt();
			c = a + b;
			System.out.println("The result is: " + c);
		}
		catch(Exception e)
		{
			System.out.println("Error in the input.");
		}
		System.out.println("Rest of the code");
	}

}
