package Day2Programs;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass;
		System.out.println("Enter Password: ");
		pass = sc.nextLine();
		int num=0, i=0;
		for(i=0;i<pass.length();i++)
		{
			if (Character.isDigit(pass.charAt(i)))
			{
				num++;
			}
		}
		if (pass.length()>=8 && num>=1)
		{
			System.out.println("Password accepted");
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}

}
