package Day2Programs;
import java.util.Scanner;

public class p9_dynamicArrays {

	public static void main(String[] args) {
		int tot;
		System.out.println("Enter the number of values: ");
		Scanner sc = new Scanner(System.in);
		tot = sc.nextInt();
		int nos[] = new int[tot];
		int i;
		for (i=0; i<tot; i++)
		{
			System.out.println("Enter value " + (i+1) + " : ");
			nos[i]= sc.nextInt();
		}
		
		for (i=0; i<tot; i++)
		{
			System.out.println("Value " + (i+1) + " : " + nos[i]);
		}
	}

}
