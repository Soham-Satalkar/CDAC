import java.util.Scanner;

public class StringPalindrome{
	
	public static boolean palindromeString(String str){
		str = str.toLowerCase();
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			j--;
			i++;
		}	
		return true;
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(palindromeString(str));
		
	}
}