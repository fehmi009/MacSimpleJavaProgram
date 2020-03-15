import java.util.Scanner;

public class AvarageNumbersProgram {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int avarage;
		int number;
		int total = 0;
		int count = 0;
		
		while(count<6) {
			number = input.nextInt();
			total = total + number;
			count++;
		}
		
		avarage = total/count;
		System.out.println(avarage);
	}
}
