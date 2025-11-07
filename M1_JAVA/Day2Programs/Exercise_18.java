package Day2Programs;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		int i, n, sh, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        System.out.println("Element to search : ");
        sh = sc.nextInt();
        
        for(i=0; i<n; i++)
        {
        	if(a[i]==sh)
        	{
        		flag = 1;
        		break;
        	}
        }
        
        if (flag ==1)
        {
        	System.out.println("Element Found");
        }
        else
        {
        	System.out.println("Element Not Found");
        }
	}

}
