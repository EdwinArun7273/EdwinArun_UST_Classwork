package Day3Programs;

class staticDemo
{
	int x = 10;
	static int y = 20;
	staticDemo()
	{
		x++;
		y++;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

public class p8_static {

	public static void main(String[] args) {
		new staticDemo();
		new staticDemo();
		new staticDemo();
		new staticDemo();
	}

}
