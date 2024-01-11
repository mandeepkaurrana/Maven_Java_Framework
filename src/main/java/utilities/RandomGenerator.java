package utilities;

import java.util.Random;

public class RandomGenerator {

	
	public static String getRandomString()
	{
		
		String az="ab1cd2ef3gh4ij5kl6mn7op8qr9st#uvwx&yz";
		
		Random r=new Random();
		
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=5;i++)
		{
			sb.append(az.charAt(r.nextInt(38)));
		}
		return sb.toString();
		
		
	}
	
	
	
}
