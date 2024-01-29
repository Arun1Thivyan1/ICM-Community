package simplepractiseprograms;

import java.util.Scanner;

public class One {
	
public static void main(String[] args) {
		
		int x,y; 
		int sum;
		
		
	    Scanner myobj= new Scanner( System.in );
		
		System.out.println("please enter the number of rice packages :");
		
		x=myobj.nextInt();
		
		System.out.println("please enter the number of wheat packages :");
		
		y=myobj.nextInt();
		
		int z=x*20;
		
		System.out.println("Total cost of rice packages :" + z);
		
		int q=y*10;
		
		System.out.println("Total cost of wheat packages :" + q);
		
		sum=z+q;
		int w =sum;
		
		
		System.out.println("Final price of purhased packages are " + w);
		
		
	}

}
