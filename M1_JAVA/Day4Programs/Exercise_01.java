package Day4Programs;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int i, t;
		System.out.println("Enter 10 elements: ");
		try
		{
			for (i=0; i<10; i++)
			{
				t = sc.nextInt();
				if (t<0)
				{
					throw new ArithmeticException("Numbers cannot be negative");
				}
				else
				{
					arr[i] = t;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("\n\nNumbers are : ");
		for (i=0; i<10; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
