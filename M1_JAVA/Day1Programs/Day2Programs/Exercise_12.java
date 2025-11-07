package Day2Programs;

public class Exercise_12 {

	public static void main(String[] args) {
		int nos[] = new int[5];
		nos[0] = 10;
		nos[1] = 2;
		nos[2] = 14;
		nos[3] = 55;
		nos[4] = 22;
		
		System.out.println("Array Elements : ");
		int i, sum=0;
		for (i=0; i<nos.length; i++)
		{
			sum+=nos[i];
			System.out.println(nos[i]);
		}
		System.out.println("Sum : " + sum);
	}

}
