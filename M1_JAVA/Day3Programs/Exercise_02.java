package Day3Programs;

class shape
{
	void getPerimeter(int l , int b)
	{
		System.out.println("Preimeter : " + (2*(l+b)));
	}
	
	void getArea(int l , int b)
	{
		System.out.println("Area : " + (l*b));
	}
}

class circle extends shape
{
	void getPerimeter(int r)
	{
		System.out.println("Preimeter of circle: " + (3.14*2*r));
	}
	
	void getArea(int r)
	{
		System.out.println("Area of circle: " + (3.14*r*r));
	}
}

public class Exercise_02 {

	public static void main(String[] args) {
		int l = 10;
		int b = 5;
		int r = 15;
		circle obj1 = new circle();
		obj1.getPerimeter(r);
		obj1.getArea(l, b);
	}

}
