package Day2Programs;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		int i, j, temp, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        
        System.out.println("Before sorting: ");
		for (i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}

                
        for (i=0; i<n; i++)
        {
        	for (j=0; j<n-i-1; j++)
        	{
        		if (a[j] > a[j+1])
        		{
        			temp = a[j];
        		    a[j] = a[j+1];
        		    a[j+1] = temp;
        		}
        	}
        }
		
		System.out.println("After sorting: " + a);
		for (i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
