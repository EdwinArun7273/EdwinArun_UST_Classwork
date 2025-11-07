import java.util.Scanner;
public class Exercise_6 {

	public static void main(String[] args) {
		String name, email, dob;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your email: ");
		email = sc.next();
		System.out.println("Enter your date of birth: ");
		dob = sc.next();
		System.out.println("Hi " + name + ", welcome to java training. Your email is " + email + " and your dob is " + dob);
	}
}