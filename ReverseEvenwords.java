package week1.day2;

public class ReverseEvenwords {

	public static void main(String[] args) {
		
		 // Declare the input as Follow
   		String test = "I am a software tester"; 
   		//split the words and have it in an array
   		String[] arr1= test.split(" ");
   		
   		for(int i=0;i<arr1.length;i++)
   		{
   			int j = i+1;
   			//find the odd index within the loop (use mod operator)
   			if(j % 2==0)
   		  				
   			{   //print the even position words in reverse order using another loop (nested loop) 
   				for (int k = arr1[i].length()-1; k >= 0; k--) 
   				{
   					
					System.out.print(arr1[i].charAt(k)); 					
   					
				}
   				System.out.print(" ");
   		//Convert words to character array if the position is even else print the word as it is(concatenate space at the end)
   			}
   			else 
   			{
   				System.out.print(arr1[i]+" ");
   			}
   		}

	}

}
