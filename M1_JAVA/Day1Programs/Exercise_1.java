import java.util.Scanner;
public class Exercise_1 {

	public static void main(String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		r = sc.nextInt();
		System.out.println("Radius of circle is: " + (3.14 * r * r));
	}

}
