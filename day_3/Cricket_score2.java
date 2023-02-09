package java_Array_String_practice;

import java.util.Scanner;

public class Cricket_score2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int targetscore;
		Scanner sc = new Scanner(System.in);
		
		//get number of team
		System.out.println("Enter Number of cricket team ");
		int n = sc.nextInt();
		if(n<=0)
		{ 
			System.out.println("invalid number of cricket");
			return;
		}
		
		int scores[] = new int[n];
		int win[] = new int[n];
		
		
		
		//get id and score for particular team from user
		for(int i=0; i<scores.length; i++)
		{
			System.out.println("Enter cricket team id ");
			int id = sc.nextInt();
			if(id<=0)
			{
				System.out.println("invalid id");
				return;
			}
			System.out.println("Enter cricket team score ");
			int score = sc.nextInt();
			if(id<=0)
			{
				System.out.println("invalid score");
				return;
			}
			
			scores[id-1]=score;
			
		}
		
		//get target score
		System.out.println("Enter target score");
		int ts = sc.nextInt();
		if(ts<=0)
		{ 
			System.out.println("invalid  target");
			return;
		}
		targetscore=ts;
		
		
		
		
		//print id and score
		System.out.println(" your score with id is ");
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i]!=0)
			{
				System.out.println(" "+(i+1)+" "+scores[i]+" ");
				
			}
			
			
		}
		
		//get win team and add to array
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i]>targetscore)
			{
				win[i]=scores[i];
			}
			else
			{
				win[i]=1;
			}
		}
		
		for(int i=0; i<win.length; i++)
		{
			if(win[i]!=1)
			{
				System.out.println("teams wins :-");
				System.out.println(i+1);
			}
		}
		
		
		
		
		


	}

}
