package Package001;

public class BubbleSortProgram {

	public static void main(String[] args) {
       int[] arr= {7,9,1,2,4,200,25,24,23,17,500,94,46};
       for(int i=0;i<arr.length-1;i++)
       {
    	   for(int j=0;j<arr.length-1;j++)
    	   {
    		   if(arr[j]>arr[j+1])
    		   {
    			   int temp=arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		   }
    	   }
       }
      for(int k=0;k<arr.length;k++)
      {
    	  System.out.print(arr[k]+" ");
      }
	}

}
