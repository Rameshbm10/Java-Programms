package Package001;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CheckNumberRepeatedInAnArray
{
   public static void main(String[] args)
   {
	  int[] arr= {1,2,1,2,2,3,5};
	  LinkedHashMap<Integer, Integer> li=new LinkedHashMap<Integer, Integer>();
	  for(int i=0;i<arr.length;i++)
	  {
		  if(li.containsKey(arr[i]))
		  {
			  int x = li.get(arr[i]);
			  li.put(arr[i], x+1);
		  }
		  else
		  {
			  li.put(arr[i], 1);
		  }
	  }
	 // System.out.println(li);//{1=2, 2=3, 3=1, 5=1}
	  for (Entry z: li.entrySet()) 
	  {
		System.out.println(z.getKey()+" : "+z.getValue());
	  }
	
}
}
