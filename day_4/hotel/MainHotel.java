package hotel;

import java.util.Scanner;

public class MainHotel {
	static String hn;
	static int rsfa;
	static boolean ht,hw;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1.Deluxe Room");
		System.out.println("2.Deluxe AC Room");
		System.out.println("3.Suite  AC Room");
		System.out.println("Select Room type :");
		int rm = sc.nextInt();
		
		if(rm==1)
		{
			System.out.println("Hotel Name");
			 hn =sc.next();
			
			System.out.println("Room Square Feet Area");
			 rsfa =sc.nextInt();
			
			sc.nextLine();
			System.out.println("Room has TV (yes/no)");
			String tem =sc.nextLine();
			 if(tem.toLowerCase() =="yes")
			  {
				  ht=true;
			  }
			  else
			  {
				  ht=false;
			  }
			 
			 System.out.println("Room has wifi (yes/no)");
				String msg =sc.nextLine();
				 if(msg.toLowerCase() =="yes")
				  {
					  hw=true;
				  }
				  else
				  {
					  hw=false;
				  }
				 
				 DeluxeRoom dr = new DeluxeRoom(hn,rsfa,ht,hw);
				 
				 dr.calculateTariff(dr.getNumberOfSqFeet(), dr.getRatePerSqFeet());
			
			
			
			
			
			
		}
		else if (rm==2)
		{
			System.out.println("Hotel Name");
			 hn =sc.next();
			
			System.out.println("Room Square Feet Area");
			 rsfa =sc.nextInt();
			
			sc.nextLine();
			System.out.println("Room has TV (yes/no)");
			String tem =sc.nextLine();
			 if(tem.toLowerCase() =="yes")
			  {
				  ht=true;
			  }
			  else
			  {
				  ht=false;
			  }
			 
			 System.out.println("Room has wifi (yes/no)");
				String msg =sc.nextLine();
				 if(msg.toLowerCase() =="yes")
				  {
					  hw=true;
				  }
				  else
				  {
					  hw=false;
				  }
				 
				 DeluxeACRoom dr = new DeluxeACRoom(hn,rsfa,ht,hw);
				 
				 dr.calculateTariff(dr.getNumberOfSqFeet(), dr.getRatePerSqFeet());
			
		}
		else if(rm==3)
		{
			System.out.println("Hotel Name");
			 hn =sc.next();
			
			System.out.println("Room Square Feet Area");
			 rsfa =sc.nextInt();
			 
			sc.nextLine();
			System.out.println("Room has TV (yes/no)");
			String tem =sc.nextLine();
			 if(tem.toLowerCase() =="yes")
			  {
				  ht=true;
			  }
			  else
			  {
				  ht=false;
			  }
			 
			 System.out.println("Room has wifi (yes/no)");
				String msg =sc.nextLine();
				 if(msg.toLowerCase() =="yes")
				  {
					  hw=true;
				  }
				  else
				  {
					  hw=false;
				  }
				 
				 SuiteACRoom dr = new SuiteACRoom(hn,rsfa,ht,hw);
				 
				 dr.calculateTariff(dr.getNumberOfSqFeet(), dr.getRatePerSqFeet());
			
			
		}else
		{
			System.out.println("invalid input");
		}


	}

}
