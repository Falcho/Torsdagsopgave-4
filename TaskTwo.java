import java.util.Scanner;
import java.util.ArrayList;

public class TaskTwo{


	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your name");
		String input = scanner.nextLine();

		System.out.println("Please Type your age");
		int ageInput = scanner.nextInt();

		int yearsUntilRetirement = 67-ageInput;


		System.out.println("Years until you can retire: "+yearsUntilRetirement);

	}
}