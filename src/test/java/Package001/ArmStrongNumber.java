package Package001;

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		int number=x;
		//int number=1234;
		//ArmStrongNumber is equal to sum of cubes of digits in the number
		int sum=0;
		while (number>0)
		{
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		if(sum==x)
		{
			System.out.println(x+" is a armstrong number");
		}
		else
		{
			System.out.println(x+" is not arm strong number");
		}
	}
}
