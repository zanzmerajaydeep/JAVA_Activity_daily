package day_4;

import java.util.Scanner;

public class Main2 {
	
	static String vm, vn,ft,fc,nd,as;
	static int ec;
	static boolean ks;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc = new Scanner (System.in);
		
		System.out.println("1.Four Wheeler");
		System.out.println("2.two Wheeler");
		System.out.println("Enter Vehicle Type");
		int num = sc.nextInt();
		
		if(num == 1) {
		    // code block
			  sc.nextLine();
			  System.out.println("Vehicle Make :");
			  String vm = sc.nextLine();
			  
			  
			  
			  System.out.println("Vehicle Number :");
			  String vn = sc.nextLine();
			  
			  System.out.println("Fuel Type :");
			  System.out.println("1.petrol");
			  System.out.println("2.Diesel");
			  int tem = sc.nextInt();
			  
			  if(tem==1)
			  {
				  ft ="Petrol";
			  }else
			  {
				   ft="diesel";
			  }
			  sc.nextLine();
			  System.out.println("Fuel Capacity :");
			  String fc = sc.nextLine();
			  
			  System.out.println("Engine CC :");
			  int ec = sc.nextInt();
			  
			  sc.nextLine();
			  System.out.println("Audio System :");
			  String as = sc.nextLine();
			  
			  System.out.println("Number of doors :");
			  String nd = sc.nextLine();
				
			  FourWheeler fw = new FourWheeler(vm,vn, ft, fc, ec, as,nd );
			  
			  fw.basicInfo();
			  fw.displayDetailInfo();
			  
		}
		else if(num == 2)
		{
			  
		  
		    // code block
			  sc.nextLine();
			  System.out.println("Vehicle Make :");
			  vm = sc.nextLine();
			  
			  System.out.println("Vehicle Number :");
			  vn = sc.nextLine();
			  
			  System.out.println("Fuel Type :");
			  System.out.println("1.petrol");
			  System.out.println("2.Diesel");
			  int temp = sc.nextInt();
			  
			  if(temp==1)
			  {
				  ft ="Petrol";
			  }else
			  {
				   ft="diesel";
			  }
			  
			  sc.nextLine();
			  System.out.println("Fuel Capacity :");
			  fc = sc.nextLine();
			  
			  System.out.println("Engine CC :");
			  ec = sc.nextInt();
			  
			  sc.nextLine();
			  System.out.println("Kick Start Available? :");
			  String msg = sc.nextLine();
			  if(msg.toLowerCase() =="yes")
			  {
				  ks=true;
			  }
			  else
			  {
				  ks=false;
			  }
			  
			
				
			  TwoWheeler tw = new TwoWheeler(vm,vn,ft, fc, ec,ks);
			  
			  tw.basicInfo();
			  tw.displayDetailInfo();
			  
			  
			  
			  
		}else {
		 
			  System.out.println("Invalid input");
		}

	}

}
