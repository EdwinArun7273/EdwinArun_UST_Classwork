class calc
{
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}
	
	void multiply(int c, int d)
	{
		int prod = c * d;
		System.out.println("Product = " + prod);
	}
}
public class Exercise_15 {

	public static void main(String[] args) {
		calc obj1 = new calc();
		obj1.add(5, 5);
		obj1.multiply(5, 5);
	}

}
