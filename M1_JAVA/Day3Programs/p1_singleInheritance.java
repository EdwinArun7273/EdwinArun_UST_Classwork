package Day3Programs;

class one
{
	int a = 10;
}

class two extends one
{
	int b = 10;
	void add()
	{
		System.out.println(a+b);
	}
}

public class p1_singleInheritance {

	public static void main(String[] args) {
		two obj1 = new two();
		obj1.add();
	}

}
