import java.util.Scanner;

public class WhiteSpace{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		str = str.replaceAll("\\s+","");

		System.out.print(str);
	}
}