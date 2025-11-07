import java.util.Scanner;
public class Exercise_3 {

	public static void main(String[] args) {
		int n1 ,n2, n3, n4, n5, sum, avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1: ");
		n1 = sc.nextInt();
		System.out.println("Enter a number 2: ");
		n2 = sc.nextInt();
		System.out.println("Enter a number 3: ");
		n3 = sc.nextInt();
		System.out.println("Enter a number 4: ");
		n4 = sc.nextInt();
		System.out.println("Enter a number 5: ");
		n5 = sc.nextInt();
		sum = n1 + n2 + n3 + n4 + n5;
		avg = sum / 5;
		System.out.println("Sum of 5 numbers is : " + sum);
		System.out.println("Average of 5 numbers is : " + avg);
	}

}
