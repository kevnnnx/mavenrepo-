package inheritance;

import java.util.Scanner;

public class SalaryOnHand {

	double bp;
	double d,bon;
	
	public void inputdata() {
		//using scanner to input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic pay");
		bp = sc.nextDouble();
		System.out.println("Enter deduction");
		d= sc.nextDouble();
		System.out.println("Enter bonus");
		bon=sc.nextDouble();
		
	}
}
