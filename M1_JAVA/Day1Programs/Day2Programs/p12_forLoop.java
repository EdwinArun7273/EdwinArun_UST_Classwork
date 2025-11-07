package Day2Programs;

public class p12_forLoop {

	public static void main(String[] args) {
		int no[] = new int[5];
		no[0] = 1;
		no[1] = 2;
		no[2] = 3;
		no[3] = 4;
		no[4] = 5;
		
		for (int n: no)
		{
			System.out.println("Value of no : " + n);
		}
	}

}
