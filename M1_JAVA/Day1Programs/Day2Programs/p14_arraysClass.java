package Day2Programs;

import java.util.Arrays;

public class p14_arraysClass {

	public static void main(String[] args) {
		int nos[] = new int[5];
		nos[0] = 10;
		nos[1] = 2;
		nos[2] = 14;
		nos[3] = 55;
		nos[4] = 22;
		
		System.out.println("Before sorting: " + nos);
		int i;
		for (i=0; i<nos.length; i++)
		{
			System.out.println(nos[i]);
		}
		
		Arrays.sort(nos);
		
		System.out.println("After sorting: " + nos);
		for (i=0; i<nos.length; i++)
		{
			System.out.println(nos[i]);
		}

	}

}
