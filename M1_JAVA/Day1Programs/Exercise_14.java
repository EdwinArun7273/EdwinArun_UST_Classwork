import java.util.Scanner;
public class Exercise_14 {

	public static void main(String[] args) {
		String s;
		int i, len, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.next();
		len = s.length();
		for (i=0; i<=(int)len/2; i++)
		{
			if (s.charAt(i) != s.charAt((int)s.length()-i-1))
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
