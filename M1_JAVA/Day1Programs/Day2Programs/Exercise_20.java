package Day2Programs;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		String name, str="";
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		name = sc.next();
		for (i=0; i<name.length(); i++)
		{
			if (Character.isDigit(name.charAt(i)))
			{
				str+=name.charAt(i);
			}
		}
			System.out.println("Order No: " + str);
	}

}
