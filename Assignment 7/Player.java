package p7;

import java.util.Scanner;

public abstract class Player {
	
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;

	abstract void accept(Scanner sc);
	
	@Override
	abstract public String toString();
	
	public Player()
	{
		
	}
	
	
	public Player(int id, String name, int age, int matchesPlayed) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
}
