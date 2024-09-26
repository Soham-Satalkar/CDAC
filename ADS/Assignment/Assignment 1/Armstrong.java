/*
In this program when user enters the number the number is checked whether its getter then 0, in while loop we first take the last digit 
and add it to the sum variable created and then divide the number by 10 so the last digit get discarded and then same process gets repeated for the 
remaining digit until the number eventually becomes 0 and then we check if the sum is equal to the number given by the user which was saved in the
originalNum if it sequal then the number is armstrong number otherwise not.
*/

import java.util.Scanner;

public class Armstrong{
	
	public static void calculate(int num){
		int originalNum = num;
		int sum=0;
		
		while(num>0){
			
			int rem = num%10;
			sum = (int)Math.pow(rem,3) + sum;
			num = num/10;
		}
		if(originalNum == sum){
			System.out.println(originalNum+" is an Armstrong Number");
		}
		else{System.out.println(originalNum+" is not an Armstrong Number");}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		calculate(num);
	}
}