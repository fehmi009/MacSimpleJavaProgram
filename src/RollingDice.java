import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {

		Random randomDice = new Random();
		
		int x = randomDice.nextInt(6);
		
		System.out.println("You just rollled : " + x);
		
		
		
	}

}
