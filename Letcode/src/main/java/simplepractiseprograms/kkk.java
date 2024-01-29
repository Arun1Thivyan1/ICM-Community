package simplepractiseprograms;

import java.util.Scanner;

public class kkk 
{
	public static void main(String[] args) {
		
		
		
		String arrpackageone[]= {"fever"};
		int arrpackagevalue[]= {1000};
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter");
		
		String enter=sc.nextLine();
		
		
		
		for(int i=0; i<arrpackageone.length;i++)
		{
			if(arrpackageone[i].equals(enter))
			{
				System.out.println(arrpackageone[i]);
				System.out.println(arrpackagevalue[i]);
			}
			else
			{
				System.out.println("enter is wrong");
			}
		}
		
		
	}

}
