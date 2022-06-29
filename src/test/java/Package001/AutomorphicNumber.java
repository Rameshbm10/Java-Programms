package Package001;

public class AutomorphicNumber
{
   public static void main(String[] args) {
	/*Automorphic number:A number is called an automorphic number 
	   if and only if the square of the given number ends with the same number itself.
	   For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and
	   the last two digits of the square represent the number itself.*/
	   
	   int num=36;
	   int sqr=num*num;
	   boolean flag=true;
	   while(num>0)
	   {
		   if(num%10 != sqr%10)
		   {
			   flag=false;
			   break;
		   }
		   num=num/10;
		   sqr=sqr/10;
	   }
	   if(flag==true)
	   {
		   System.out.println("number is automorphic number");
	   }
	   else
	   {
		   System.out.println("number is not a automoporhic number");
	   }
}
}
