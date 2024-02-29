import java.util.ArrayList;

public class TaskOne{

	public static void main(String[]args){
		Team hold1 = new Team("Team Alpha");
		Team hold2 = new Team("Team Bravo");
		Team hold3 = new Team("Team Charlie");
		Team hold4 = new Team("Team Delta");
		Team hold5 = new Team("Team Echo");
		Team hold6 = new Team("Team Foxtrot");

		hold1.setRank(1);
		hold2.setRank(2);
		hold3.setRank(3);
		hold4.setRank(4);
		hold5.setRank(5);
		hold6.setRank(6);

		System.out.println(hold1);
		System.out.println(hold2);
		System.out.println(hold3);
		System.out.println(hold4);
		System.out.println(hold5);
		System.out.println(hold6);
		
	}
}
class Team{
			private String name;
			private int rank;
			private ArrayList<String> playerNames = new ArrayList<>();

			Team(String teamName){
				this.name = teamName;
			}

			public void setRank(int teamRank){
				this.rank = teamRank;
			}

			public String toString(){
				return "Hold: "+name+", Rang: "+rank;
			}

		}