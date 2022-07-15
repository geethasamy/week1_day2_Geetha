package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
		//Declare A String value as"madam"
		String str = "madam";
		
		//Declare another String rev value as ""
		String palin = "";
		
		//Iterate over the String in reverse order
		for (int i = str.length()-1; i >= 0; i--)
		{
			//Add the char into rev
		   palin = palin + 	str.charAt(i);			
		}
		//Compare the original String with the reversed String, if it is same then print palinDrome
		if(palin.equalsIgnoreCase(str))
		{
			System.out.println(str + "is a palindrome");
		}
		else
		{
			System.out.println(str + "is not a palindrome");
		}
	}	

}
