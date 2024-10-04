import java.util.Scanner;

public class ReverseStringUsingStack{
	
	int top = -1;
	
	public void reverseString(String str, char[] arr){
		int size = str.length();
		
		if(size == 0){
			System.out.println("Empty stack");
		}
		else{
			for(int i=0;i<size;i++){
				top++;
				arr[top] = str.charAt(i);
			}
			for(int i=0;i<size;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			for(int i = top; i>=0;i--){
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int size = str.length();
		char[] arr = new char[size];
		
		ReverseStringUsingStack obj = new ReverseStringUsingStack();
		
		obj.reverseString(str, arr);
	}
}