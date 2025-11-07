import java.util.Scanner;
public class Exercise_8 {

	public static void main(String[] args) {
		int i, j, temp;
		int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (i=0; i<5; i++)
        {
        	a[i] = sc.nextInt();
        }
        
        for (i=0; i<5; i++)
        {
        	for (j=0; j<5-i-1; j++)
        	{
        		if (a[j] > a[j+1])
        		{
        			temp = a[j];
        		    a[j] = a[j+1];
        		    a[j+1] = temp;
        		}
        	}
        }
        System.out.println("Largest number is: " + a[4]);
	}

}
