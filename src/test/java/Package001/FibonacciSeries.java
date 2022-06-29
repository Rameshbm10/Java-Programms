package Package001;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter first number :");
	  int num1=sc.nextInt();
	  System.out.println("enter second number :");
	  int num2=sc.nextInt();
	  int num3;
	  System.out.print(num1+" "+num2+" ");
	  for(int i=1;i<=10;i++)
	  {
		  num3=num1+num2;
		  num1=num2;
		  num2=num3;
		  System.out.print(num3+" ");
	  }
}
}
