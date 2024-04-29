package p7;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	private int wickets;
	private int runs;
	
	public int getWik() {
		return this.wickets;
	}
	
	public int getRun() {
		return this.runs;
	}
	
	@Override
	public int getWickets(Scanner sc) {
		System.out.println("Wickets Taken :");
		this.wickets=sc.nextInt();
		return this.wickets;
		}
	
	

	@Override
	public int getRuns(Scanner sc) {
		System.out.println("Runs Scored: ");
		this.runs=sc.nextInt();
		return this.runs;
	}

	void accept(Scanner sc) {
		System.out.println("Enter player id :  ");
		setId(sc.nextInt());
		
		System.out.println("Enter name :  ");
		setName(sc.next());
		
		System.out.println("Enter age :  ");
		setAge(sc.nextInt());
		
		System.out.println("Enter matches played :  ");
		setMatchesPlayed(sc.nextInt());
			
		getWickets(sc);
		getRuns(sc);
		
		System.out.println("..................................................");		
	}
//public String toString1() {
//		
//		return "**Cricketer**"+"\n"+"id: "+this.getId()+"\n"+"Name: "+this.getName()+"\n"+"Age: "+this.getAge()+"\n"+"Match Played: "+this.getMatchesPlayed()+"\n"+"Wickets: "+this.wickets+"\n"+"Runs: "+this.runs;
//	}

@Override
public String toString() {
	return "**Cricketer**"+"\n"+"id: "+this.getId()+"\n"+"Name: "+this.getName()+"\n"+"Age: "+this.getAge()+"\n"+"Match Played: "+this.getMatchesPlayed()+"\n"+"Wickets: "+this.wickets+"\n"+"Runs: "+this.runs;
}


	
	
}
