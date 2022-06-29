package Package001;

import java.util.Scanner;

public class CheckRangeOfPrimeNumbers {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       checkPrime(num);
	}
	public static void checkPrime(int number)
	{
		
		System.out.println("Range of prime numbers between "+1+" and "+number);
		for(int i=1;i<=number;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
			System.out.print(i+" ");
			}
	   }
	}
}
