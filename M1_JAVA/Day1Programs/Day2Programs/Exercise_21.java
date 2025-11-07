package Day2Programs;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter your string: ");
		str = sc.nextLine();
		int cnt=0, i=0;
		for(i=0;i<str.length();i++)
		{
			if (str.charAt(i)==' ')
			{
			    while (str.charAt(i)==' ')
			    {
					i++;
			    }
			    cnt+=1;
			}
		}
		if (i>0)
		{
			cnt+=1;
		}
		System.out.println("Number of words: " + cnt);
	}
}
