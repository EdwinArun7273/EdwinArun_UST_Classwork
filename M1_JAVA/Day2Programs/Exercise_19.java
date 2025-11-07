package Day2Programs;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		String name;
		int i, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		name = sc.next();
		for (i=0; i<name.length(); i++)
		{
			if (Character.isDigit(name.charAt(i)))
			{
				flag = 1;
				break;
			}
		}
		
		if (flag == 1)
		{
			System.out.println("Name contains number");
		}
		else
		{
			System.out.println("Name does not contains number");
		}
	}

}
