package Day3Programs;

interface shape1
{
	double getArea();
}

class rectangle implements shape1
{
	int len, bre;
	rectangle(int l, int b){
		len = l;
		bre = b;
	}

	@Override
	public double getArea() {
		return len*bre;
	}
}

class circle1 implements shape1
{
	int rad;
	circle1(int r){
		rad = r;
	}

	@Override
	public double getArea() {
		return 3.14*rad*rad;
	}
	
}

class triangle implements shape1
{
	int hei, bas;
	triangle(int h, int b){
		hei = h;
		bas = b;
	}

	@Override
	public double getArea() {
		return 0.5*hei*bas;
	}
}

public class Exercise_06 {

	public static void main(String[] args) {
		rectangle obj = new rectangle(2, 3);
		circle1 obj1 = new circle1(5);
		triangle obj2 = new triangle(6, 8);

		System.out.println(obj.getArea());
		System.out.println(obj1.getArea());
		System.out.println(obj2.getArea());
	}

}
