package Package001;

public class NumberPalindrome {

   public static void main(String[] args) {
	int num=12321;
	int tempnum=num;
	int rev=0;
	while(tempnum>0)
	{
		int rem = tempnum%10;
		rev=rem+rev*10;
		tempnum=tempnum/10;
	}
	if(num==rev)
	{
		System.out.println("palindome number");
	}
	else
	{
		System.out.println("not a palindrome number");
	}
}
}
