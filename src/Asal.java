import java.util.Iterator;
import java.util.Scanner;

public class Asal
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int i, j;
		boolean asal;
		System.out.println("*** 1-100 ARASINDAKI ASAL SAYILAR ***");
		
		for(i=2; i<=100; i++) 
		{
			asal=true;
			for(j=2; j<i; j++) 
			{
				if(i%j == 0) 
				{
					asal=false;
					break;
				}
			}
			if(asal) 
			{
				System.out.println(i + " ");
			}
		}
	}
}