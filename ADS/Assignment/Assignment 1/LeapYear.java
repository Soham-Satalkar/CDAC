import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		
		if ( year%400 == 0 ){
			System.out.println("Leap");
		}
		
		else if(year%4 ==0){
			if(year%100 == 0){
				System.out.println("Not");
			}
			else{
				System.out.println("Leap");
			}
		}
		else{
			System.out.println("Invalid");
		}
	}
}