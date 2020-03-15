import java.util.Scanner;

public class BasicCalculatorProgram {

	public static void main(String[] args) {
		
		Scanner bucky = new Scanner (System.in);
		
		double fnum, snum, answer;
		
		System.out.println("Enter Fist number ; " );
		
		fnum = bucky.nextDouble();
		
		System.out.println("Enter Second number ; " );
		
		snum = bucky.nextDouble();
		
		answer = fnum + snum;
		
		System.out.println(answer);
	}
}
