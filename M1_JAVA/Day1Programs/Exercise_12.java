import java.util.Scanner;
public class Exercise_12 {

	public static void main(String[] args) {
		int nr, or, u, charge;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new reading: ");
        nr = sc.nextInt();
        System.out.println("Enter old reading: ");
        or = sc.nextInt();
        u = nr - or;
        System.out.println("Units: " + u);
        charge = 0;
        if (u>=101 && u<=200)
        {
        	charge += (u-100)*1;
        }
        else if (u>=201 && u<=300)
        {
        	charge += 100 + (u-200)*2;
        }
        else if (u>=301 && u<=400)
        {
        	charge += 100 + 200 + (u-300)*3;
        }
        else if (u>=401)
        {
        	charge += 100 + 200 + 300 + (u-400)*4;
        	charge += charge*0.1;
        }
        System.out.println("Charge : " + charge);
	}

}
