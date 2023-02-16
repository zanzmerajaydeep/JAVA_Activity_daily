package TreeMap_ex_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Player {

	
	protected String name;
	protected String team;
	protected String skill;

	static TreeMap<Integer, Player> tm = new TreeMap<Integer, Player>();

	public Player(String name, String team, String skill) {
		super();
		
		this.name = name;
		this.team = team;
		this.skill = skill;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		int numberOfPlayers = Integer.parseInt(reader.readLine());

		for (int i = 1; i <= numberOfPlayers; i++) {
			System.out.println("Enter the details player : " + i);
			tm.put(Integer.parseInt(reader.readLine()),
					new Player(reader.readLine(), reader.readLine(), reader.readLine()));
		}

		System.out.println("Player Details");

		for (Map.Entry<Integer, Player> entry : tm.entrySet()) {

			Player p = entry.getValue();
			System.out.println(entry.getKey() + "--" + p.name + "--" + p.team + "--" + p.skill + "");
		}

	}

}
