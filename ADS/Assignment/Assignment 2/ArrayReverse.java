import java.util.Scanner;

public class ArrayReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int s=0;
		int j=n-1;
		while(s<j){
			int temp = arr[s];
			arr[s]=arr[j];
			arr[j]=temp;
			s++;
			j--;
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");
		}	
	}
}