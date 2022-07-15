package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Declare String Input as Follow
		String test = "changeme";
		//Traverse through each character (using loop)
		for (int i = 0; i < test.length(); i++) {
			//find the odd index within the loop (use mod operator)
			if (i%2==0)
			{   
				char c= test.charAt(i);
				//within the loop, change the character to uppercase,
				System.out.print(Character.toUpperCase(c));
				
			}
			// if the index is odd else don't change
			else
			{
				System.out.print(test.charAt(i));
			}
			
		}

	}

}
