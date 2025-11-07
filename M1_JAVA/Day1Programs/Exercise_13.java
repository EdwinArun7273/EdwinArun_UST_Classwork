import java.util.Scanner;
public class Exercise_13 {

	public static void main(String[] args) {
		int i=0, n=0, o = 0, e = 0;
		int[] a = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		do
		{
			n = sc.nextInt();
			a[i] = n;	
			i++;
		}while (n != -999);
		
		for (i=0; a[i]!=-999; i++)
		{
			if (a[i]%2==0)
			{
				e+=1;
			}
			else
			{
				o+=1;
			}
		}
		System.out.println("Odd = " + o + "\nEven = " + e);
	}

}
