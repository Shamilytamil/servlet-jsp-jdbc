package numbersTest.java;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		 int sNumber,eNumber,len=0;
		 short eveLen=0,oddLen=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your start number:\n");
		sNumber = in.nextInt();
		
		System.out.println("Enter your End number must be greater than start Number:\n");
		eNumber = in.nextInt();
		
	
		for(int i = sNumber;i<=eNumber;i++)
		{
		System.out.println(i + ", ");
		len++;
		
		if(i%2 == 0)
		{
			eveLen++;
		}
		else {
			oddLen++;
		}
		
		}
		len = len-2;
		System.out.println("\nNumbers between start to end is:" + len );
		System.out.println("\nNumber of even numbers is :" + eveLen );
		System.out.println("\nNumber of odd numbers is :" + oddLen );
	}

}
