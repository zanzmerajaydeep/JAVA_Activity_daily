package java_Array_String_practice;

import java.util.Scanner;

public class Maximum_sum_of_Odd_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Array size");
		int n = sc.nextInt();
		if(n<=0)
		{ 
			System.out.println("invalid array size");
			return;
		}
		
		int numbers[] = new int[n];
		int oddsum=0;
		int evensum=0;
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Array value "+(i+1)+" element ");
			int tem = sc.nextInt();
			if(tem<=0)
			{
				System.out.println("invalid array element");
				return;
			}else
			{
		    numbers[i] = tem;
			}
		}
		
		System.out.println(" your Array is ");
		for(int s : numbers)
		{
			System.out.println(" "+s+"");
		}
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]%2==0)
			{
				evensum = evensum+numbers[i]; 
			}
			else
			{
				oddsum = oddsum+numbers[i];
			}
		}
		System.out.println("your sum of odd is : "+oddsum+"");
		System.out.println("your sum of even is : "+evensum+"");
		System.out.println("maximum of evensun and "+Math.max(oddsum, evensum)+"");

	}

}
