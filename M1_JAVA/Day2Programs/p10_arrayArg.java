package Day2Programs;

public class p10_arrayArg {

	public static void main(String[] args) {
		int nos[] = new int[5];
		nos[0] = 10;
		nos[1] = 22;
		nos[2] = 3;
		nos[3] = 45;
		nos[4] = 100;
		
		int greatest = findGreatest(nos);
		System.out.println(greatest);
	}
	
	static int findGreatest(int nos[])
	{
		int tot = nos.length,i;
		int greatest = nos[0];
		for (i=0; i<tot; i++)
		{
			if (nos[i]>greatest)
			{
				greatest = nos[i];
			}
		}
		return (greatest);
	}

}
