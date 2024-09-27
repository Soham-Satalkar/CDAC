import java.util.Scanner;

public class NumberReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		revNum(num);
	}
	
	public static void revNum(int num){
		
		int ogNum = num;
		
		num = Math.abs(num);
		
		int sum=0;
		while(num>0){
			int rem = num%10;
			sum = sum*10 + rem;
			num = num/10;
		}
		
		if(ogNum<0){
			sum=-sum;
		}
		
		System.out.println(sum);
	}
}