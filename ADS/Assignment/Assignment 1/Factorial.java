/*
Here we have used recursive method to find the factorial of the number.
fact(num-1) gets the factorial of the previous number until the number reaches 1 and then calculate the num*fac(num-1);
*/

import java.util.Scanner;
public class Factorial{
	
	public static int fact(int num){
		if(num<=1){
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String args[]){

		int num = new Scanner(System.in).nextInt();
		
		System.out.println("Fcatorial of "+num+ " is: "+fact(num));
	} 
}