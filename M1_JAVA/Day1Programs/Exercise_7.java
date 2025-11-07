import java.util.Scanner;
public class Exercise_7 {

	public static void main(String[] args) {
		float sum = 0, avg, num = 0, cnt = -1;
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter numbers: ");
		while (num != -999)
		{
			cnt++;
			sum += num;
			num = sc.nextInt();
		}
		avg = sum / cnt;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}

}
