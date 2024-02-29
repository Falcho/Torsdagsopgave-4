import java.util.ArrayList;

public class TaskFour{

	public static void main(String[]args){
		ArrayList<String> actionsList = new ArrayList<>();

		actionsList.add("Start game");
		actionsList.add("Resume game");
		actionsList.add("Pause game");
		actionsList.add("End game");

		//System.out.println(actions.get(2)); // Forventet print : "Pause game"

		GameMenu menu = new GameMenu(actionsList);

		menu.displayMenu(actionsList);
		
	}
}