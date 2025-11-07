package Day4Programs;

import java.util.Scanner;

public class p5_throw {
	static void validate(int a)
	{
		if (a < 18)
		{
			throw new ArithmeticException("Age is Invalid");
		}
	}

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the participant");
		age = sc.nextInt();
		try
		{
			validate(age);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}

}
