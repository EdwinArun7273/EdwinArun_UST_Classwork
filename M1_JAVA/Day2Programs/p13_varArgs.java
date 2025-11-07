package Day2Programs;

public class p13_varArgs {

	public static void main(String[] args) {
		addNumbers(1);
		addNumbers(1,2);
		addNumbers(1,2,3);
		addNumbers(1,2,3,4);
	}
	
	static void addNumbers(int a, int ...b)
	{
		int tot = b.length;
		int sum = a;
		int i;
		for(i=0; i<tot; i++)
		{
			sum+=b[i];
		}
		System.out.println(sum);
	}

}
