package week1.day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
    //a) Use the declared String text as input
	//	String text = "We learn java basics as part of java sessions in java week1";
	String text = "We learn java basics as part of java sessions in java week1";
	//b) Initialize an integer variable as count
	int count =0;
	String[] arr1 = text.split(" ");
	//c) Split the String into array and iterate over it 
	for (int i = 0; i < arr1.length; i++) {
	//d) Initialize another loop to check whether the word is there in the array	
		if(arr1[i].equals("java"))
		{
	       //e) if it is available then increase and count by 1.
			count = count+1;
			if(count > 1) {
			//f) if the count > 1 then replace the word as "" 	
				arr1[i]="";
				
			}
						
		}
		if(arr1[i]=="")
		{	
			System.out.print("");
		}
		//g) Displaying the String without duplicate words	
		else
		{
			System.out.print(" "+arr1[i]);
		}
	}
	
	
	}

}
