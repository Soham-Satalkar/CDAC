import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		/*
		for(int ele : arr){
			System.out.print(ele+" ");
		}
		*/
		Arrays.sort(arr);
		
		if(n==0 || n==1){
			System.out.print("Array length: "+n);
		}
		else{
			int j=0;
			for(int i=0;i<n-1;i++){
				if(arr[i] !=arr[i+1]){
					arr[j++] = arr[i];
				}
			}
			arr[j++] = arr[n-1];
			System.out.println(j);
		}		
	}
}