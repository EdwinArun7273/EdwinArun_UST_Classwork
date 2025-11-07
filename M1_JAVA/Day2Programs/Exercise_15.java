package Day2Programs;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size = ");
        n = sc.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++)
        {
        	System.out.println("Element of a[" + i + "] = ");
        	a[i] = sc.nextInt();
        }
        
        System.out.println("Display Array Elements");
		for (i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}

}
