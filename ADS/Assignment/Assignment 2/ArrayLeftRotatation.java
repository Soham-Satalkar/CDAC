import java.util.Scanner;

public class ArrayLeftRotatation{
	
	public static void main(String args[]){
		
		int[] arr = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		
		int size = arr.length;
		
		int [] newArr = new int[size];
		for(int i = 0; i<size;i++){
			newArr[i] = arr[(i+d)%size];
		}
		
		for(int i = 0; i<size;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}