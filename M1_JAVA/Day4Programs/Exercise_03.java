package Day4Programs;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		String pass;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Password");
			pass = sc.next();
			if (pass.length() < 8)
			{
				throw new ArithmeticException("Password should contain 8 digits or more");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
