package p7;

import java.util.Scanner;

public class Program7 {
	public static int menu(Scanner sc)
	{
		System.out.println("0.Exit .");
		System.out.println("1.Number of total runs.");
		System.out.println("2.Wickets taken by all players .");
		System.out.println("3.Total matches played .");
		System.out.println("4.Information of players .");
		System.out.println("Enter the choice - ");
		return sc.nextInt();

	}
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int choice,counter=0;
		
	
		Player[] team=new Player[11];
		Player p= null;
		System.out.println("Enter player information:  ");
		for(int i=0;i<team.length;i++)
		{
			p= new Cricketer();
			p.accept(sc);
			team[i]=p;
		}
		while((choice = menu(sc))!= 0) {
			switch(choice) {
			case 0:
				System.out.println("Thank you.");
				break;
			
			case 1:
				int totalRuns=0;
				for(Player ct:team ) {
					Cricketer c=(Cricketer) ct;
					totalRuns+=c.getRun();
					
				}
				System.out.println("Total runs scored are : "+totalRuns);
				break;
				
			case 2:
				int totalWicket=0;
				for(Player ct:team) {
					Cricketer c=(Cricketer)ct;
					totalWicket += c.getWickets(sc); 
					
				}
				System.out.println("Total Wickets :"+totalWicket);
				break;
				
				
			case 3:
				int totalMatch=0;
				for(Player cricks : team) {
					Cricketer c = (Cricketer) cricks;
					totalMatch += c.getMatchesPlayed();
				}
				System.out.println("Total wickets: "+totalMatch);
				break;
			
			case 4:
				for(Player cricks : team) {
					Cricketer c = (Cricketer) cricks;
					System.out.println("id:"+c.getId()+"Name: "+c.getName()+"Match Played: "+c.getMatchesPlayed());
				}
				break;
				
			default:
				System.out.println("Wrong choice .");
				break;
			
			
			}
			
		}
		
	}

}
