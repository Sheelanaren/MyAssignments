package week1.day2;

public class FibnacciSeries {

	public static void main(String[] args)
	
	{
		int range=8;
		int firstnum=0;
		int secnum=1;
		int thirdnum=1;
		System.out.println("The fibinacciSeries");
		for (int i = 0; i < range; i++) {
			System.out.println(firstnum+",");
			thirdnum = firstnum+secnum;
			firstnum = secnum;
			secnum = thirdnum;	
			
		}
		}
				
		

	}


