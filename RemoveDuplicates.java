package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		String companyName="PayPal India";
	
		
		char[] ch = companyName.toCharArray();
		
	
		
		Set<Character> unique= new LinkedHashSet<Character>();
		
		
		
		for (Character character : ch) 
		{
			
			unique.add(character);
		}
		
		System.out.print(unique);

	}


	}


