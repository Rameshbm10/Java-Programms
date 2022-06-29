package Package001;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		/*Scanner  sc=new Scanner(System.in);
		String org=sc.next();
		String temp=org;
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
		   rev=rev+org.charAt(i);	
		}
		System.out.println(rev);*/
		
		
		
		Scanner sc=new Scanner(System.in);
		String orgStr="madam";//sc.next();//hello
		String tempStr=orgStr;
		char[] arr=orgStr.toCharArray();
		String revStr = "";
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	revStr=revStr+arr[i];
	    }
        if(orgStr.equals(revStr))
        {
        	System.out.println(orgStr+" is a palindrome string");
        }
        else
        {
        	System.out.println(orgStr+" is not a palindrome string");
        }
	}

}
