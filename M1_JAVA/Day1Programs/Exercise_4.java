import java.util.Scanner;
public class Exercise_4 {

	public static void main(String[] args) {
		float bs, da, hra, cca, pf, gp, np;
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter basic Salary : ");
		bs = sc.nextInt();
		da = (float)(bs * 0.3);
		hra = (float)(0.18*bs);
		cca = (float)(0.2*bs);
		pf = (float)(0.08*bs);
		gp = (float)(bs + da + hra + cca + pf);
		np = (float)(gp - pf);
		
		System.out.println("Basic Salary : " + bs);
		System.out.println("Dearness Allowance : " + da);
		System.out.println("Home Rent Allowance : " + hra);
		System.out.println("City Compensation Allowance : " + cca);
		System.out.println("Provident Fund : " + pf);
		System.out.println("Gross Pay : " + gp);
		System.out.println("Net Pay : " + np);
	}

}
