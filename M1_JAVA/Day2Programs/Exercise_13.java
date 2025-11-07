package Day2Programs;

public class Exercise_13 {

	public static void main(String[] args) {
		int nos[] = new int[5];
		nos[0] = 10;
		nos[1] = 2;
		nos[2] = 14;
		nos[3] = 55;
		nos[4] = 22;
		
		System.out.println("Array Elements : ");
		int i, sum=0;
		float avg;
		for (i=0; i<nos.length; i++)
		{
			sum+=nos[i];
			System.out.println(nos[i]);
		}
		avg=sum/nos.length;
		System.out.println("Average : " + avg);
	}

}
