package Package001;

import java.util.Arrays;

public class AnagramString 
{
   public static void main(String[] args)
   {
	   //Two Strings are called the anagram if they contain the same characters.
	    //However, the order or sequence of the characters can be different
	String str1="Abcde";
	String str2="abcDx";
	//step1:check length
	if(str1.length()!=str2.length())
	{
		System.out.println("not a anagram strings");
	}
	else
	{
		//step 2:convert to lowercase
		String str11=str1.toLowerCase();
		String str21 = str2.toLowerCase();
		//step3:convert to charecter array
		char[] arr1=str11.toCharArray();
		char[] arr2=str21.toCharArray();
		//step4:sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//step5:compare the arrays
		boolean status=Arrays.equals(arr1, arr2);
		if(status==true)
		{
			System.out.println("strings are anagram");
		}
		else
		{
			System.out.println("not anagram strings");
		}
	}
	
}
}
