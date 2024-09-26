/*
Here 0 and 1 is first printed then the addition of the n1 and n2 is stored in num and n2 is stored in n1 and num is stored in n2 which is new number 
so this is continued until the given number 
*/

import java.util.Scanner;
public class Fibonacci{
	public static void fibo(int input){
		int n1=0,n2=1;
		System.out.print(n1+" "+n2);
		
		int num;
		for(int i=2;i<input;i++){
			num = n1+n2;
			System.out.print(" "+num);
			n1=n2;
			n2=num;
		}
	} 
	public static void main(String args[]){
		
		int input = new Scanner(System.in).nextInt();
		
		fibo(input);
		
	}
}