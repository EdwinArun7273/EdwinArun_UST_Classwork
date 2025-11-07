import java.util.Scanner;
public class p12_whileLoop {

	public static void main(String[] args) {
		int i = 1, n, sum = 0, avg;
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter 5 numbers: ");
		while(i<=5)
		{
			n = sc.nextInt();
			sum+=n;
			i++;
		}
		avg = sum/5;
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + avg);
	}

}
