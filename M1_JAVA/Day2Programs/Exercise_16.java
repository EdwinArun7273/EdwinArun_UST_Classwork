package Day2Programs;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		int i, n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size = ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
        	sum +=a[i];
        }
        
        System.out.println("Array = \n");
		for (i=0; i<n; i++)
		{
			System.out.print(a[i]+ "  ");
		}
		System.out.println("\nSum = " + sum);
	}

}
