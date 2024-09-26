/*
we know that 2 is the only even prime number and 1 is not a prime number so first we can declare if these two numbers are given by user, 
now we have to check all the odd numbers we can achieve this by using for loop where we can check the number till its squareroot because any 
non-prime number will have factors that can be found within this range so if no number is found the method will return true and will print 
that the number is prime.
*/

import java.util.Scanner;

public class Prime{
	
	public static boolean prime(int num){
		if(num <=1){
			return false;
		}
		if(num == 2){
			return true;
		}
		if(num%2 == 0){
			return false;
		}
		for(int i=3;i<=Math.sqrt(num);i+=2){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();	
		
		if(prime(num)){
			System.out.println("Prime");
		}		
		else{
			System.out.println("Not Prime");
		}
	}
}