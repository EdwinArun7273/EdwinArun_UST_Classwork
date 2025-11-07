package Day3Programs;

class program1
{
	program1()
	{
		System.out.println("In Program 1");
	}
}

class program2 extends program1
{
	program2()
	{
		System.out.println("In Program 2");
	}
}

class program3 extends program2
{
	program3()
	{
		System.out.println("In Program 3");
	}
}

public class p9_multiLevelInheritance {

	public static void main(String[] args) {
		new program3();
	}

}
