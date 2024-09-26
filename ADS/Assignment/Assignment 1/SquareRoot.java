import java.util.Scanner;

public class SquareRoot{
	
	public static int sqrt(int num){
		if(num == 0 || num ==1){
			return num;
		}
		int start=1;
		int end = num;
		int res = 0;
		while(start<=end){
			int mid = start + (end - start)/2;
			
			if(mid*mid == num){
				return mid;
			}
			
			if(mid*mid == num){
				return mid;
			}
			
			if(mid*mid<num){
				start = mid+1;
				res=mid;
			}
			else{
				end=mid -1;
			}
			
		}
		return res;
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int squareRoot = sqrt(number);
		
		System.out.println("Square Root of "+number+ " is "+squareRoot);
		
	}
}