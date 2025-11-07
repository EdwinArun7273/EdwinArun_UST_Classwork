import java.util.Scanner;
public class Exercise_9 {

	public static void main(String[] args) {
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
        num = sc.nextInt();
        
        for (i=0; i<=10; i++)
        {
        	System.out.println(i + " * " + num + " = " + (i * num));
        }
	}

}
