import java.util.ArrayList;

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
	}
