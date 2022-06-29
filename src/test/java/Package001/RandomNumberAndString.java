package Package001;

import java.util.Random;

public class RandomNumberAndString 
{
  public static void main(String[] args) {
	Random ran=new Random();
	int randomNumber = ran.nextInt(100);
	System.out.println(randomNumber);
}
}
