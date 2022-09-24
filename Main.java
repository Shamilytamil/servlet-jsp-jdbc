package numbersTest.java;

import java.util.*;

public class Main {
	public static void main (String[] args) {
		
		 int sNumber,eNumber,len=0;
		 short eveLen=0,oddLen=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your start number:\n");
		sNumber = in.nextInt();
		
		System.out.println("Enter your End number must be greater than start Number:\n");
		eNumber = in.nextInt();
		ArrayList<Integer>  eveList = new ArrayList<Integer>();
		ArrayList<Integer>  oddList = new ArrayList<Integer>();
		
		for(int i = sNumber;i<=eNumber;i++)
		{
		System.out.println(i + ", ");
		len++;
		
		if(i%2 == 0)
		{
			eveLen++;
			eveList.add(i);
			
		}
		else {
			oddLen++;
			oddList.add(i);
			
		}
		
		}
		len = len-2;
		System.out.println("\nNumbers between start to end is:" + len );
		System.out.println("\nNumber of even numbers is :" + eveLen );
		System.out.println("\nNumber of odd numbers is :" + oddLen );
		System.out.println("\nEven Numbers :" + eveList );
		System.out.println("\nODD Numbers :" + oddList );
	}

}
