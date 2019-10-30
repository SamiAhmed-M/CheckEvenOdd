package evenOddCheck;
// Project to check if a given number is odd or even
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// Scanner object
				Scanner myObj = new Scanner(System.in);
				// Prompt user
				System.out.println("Please enter a number to check even or odd");
				int n = myObj.nextInt();
				myObj.close();
				CheckOddEven obj = new CheckOddEven();
				obj.display(n);

	}

}
