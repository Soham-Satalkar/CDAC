import java.util.Scanner;

public class StringReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String revstr="";
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			revstr = ch + revstr;
		}
		System.out.print(revstr);
	}
}