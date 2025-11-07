package Day3Programs;

class counter
{
	static int count = 0;
	counter()
	{
		count+=1;
		System.out.println("Count: " + count);
	}
}

public class Exercise_03 {

	public static void main(String[] args) {
		new counter();
		new counter();
		new counter();
		new counter();
		new counter();
	}

}
