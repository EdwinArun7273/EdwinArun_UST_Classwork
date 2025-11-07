import java.util.Scanner;
public class Exercise_2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		System.out.println("Number divisible by 7 : " + (n % 7 == 0));

	}

}
