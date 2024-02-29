import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	private ArrayList<String> actionsList = new ArrayList<>();
	
	public GameMenu(ArrayList<String> actionsList){
		this.actionsList = actionsList;

		}
	public void displayMenu(ArrayList<String> actionsList){
		this.actionsList = actionsList;
		for(String option : actionsList){ 
			System.out.println(option);
			// for loop oven over kan også skrives :
			// actionsList.forEach(System.out::prinln);
			}
		}

	public int getAction(ArrayList<String> actionsList){
		this.actionsList = actionsList;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a Number to choose an action");
		displayMenu(actionsList);

		int choice;

		if(scan.hasNextInt()){
		choice = scan.nextInt();
			if(choice > 0 && choice < actionsList.size()){
				return choice;
			}else{
			System.out.println("This is not a chooseable option");
				choice = 0;
			return getAction(actionsList);				
			}
		}else{
			System.out.println("This is not a chooseable option");
				choice = 0;
			return getAction(actionsList);

		}
		

	}



 /*public int doAct() {

	boolean isChoosing = true;


	int choice;

	while(isChoosing) {
		displayMenu(actionsList);

		choice = getUserInput("Make a choice xd");
		if (choice > 0 && choice < actionsList.size()) {
			isChoosing = false;
			return choice;
		} else {
			System.out.println("Invalid choice - try again");
		}

	}
	return 0;
}

public int getUserInput(String msg) {
	System.out.println(msg);
	Scanner scan  = new Scanner(System.in);
	int input = scan.nextInt();
return input;
}*/
}