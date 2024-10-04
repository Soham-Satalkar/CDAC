public class StackUsingArray{
	static int size = 5;
	static int top = -1;
	
	static void push(int num,int[] arr){
		if(top == size-1){
			System.out.println("Stack is Full.");
		}else{
			top++;
			arr[top] = num;
		}
	}
	
	static void pop(int[] arr){
		if(top == -1){
			System.out.println("Stack is Empty.");
		}else{
			System.out.println("Popped Element = "+ arr[top]);
			top--;
		}
		
	}
	
	static void display(int[] arr){
		if(top == -1){
			System.out.println("Stack is Empty.");
			return;
		}
		System.out.print("Stack [ ");
		for(int i = 0; i <= top; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String args[]){
		
		int[] arr = new int[size];
		
		push(10, arr);
		push(20, arr);
		push(30, arr);
		
		display(arr);
		
		pop(arr);
		pop(arr);
		
		display(arr);
	}
}