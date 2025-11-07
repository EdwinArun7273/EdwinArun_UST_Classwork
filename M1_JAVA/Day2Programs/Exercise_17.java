package Day2Programs;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size = ");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
        	b[i]=a[i];
        }
        
        System.out.println("Copy of Array: ");
		for (i=0; i<n; i++)
		{
			System.out.println(b[i]);
		}
	}

}
