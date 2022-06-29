package Package001;

public class SecondLargestNumber 
{
   public static void main(String[] args) {
	int[] arr= {1,7,9,46,17,10,18,21,23,24,96};
	int largest=0;
	int secLargest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			secLargest=largest;
			largest=arr[i];
		}
		else if(arr[i]>secLargest)
		{
			secLargest=arr[i];
		}
	}
	System.out.println("largest number: "+largest);
	System.out.println("second largest number : "+secLargest);
}
}
