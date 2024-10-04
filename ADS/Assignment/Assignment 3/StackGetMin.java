public class StackGetMin{
	int size = 5;
	int[] pushStack = new int[size];
	int[] popStack = new int[size];
	int pushTop =-1 , popTop = -1;
	
	void pushElement(int data){
		if(pushTop == size-1){
			System.out.println("Stack is Full");
		}
		pushTop++;
		pushStack[pushTop] = data;
		System.out.println("Inserted: "+data);
	}
	
	void popElement(){
		if(pushTop == -1){
			System.out.println("Stack is Empty");
		}
		popTop++;
		popStack[popTop] = pushStack[pushTop];
		System.out.println("Popped: "+pushStack[pushTop]);
		pushTop--;
	}
	
	void getMin(){
		if(pushTop == -1){
			System.out.println("Stack is Empty");
		}
		int minEle = pushStack[0];
		for(int i=1;i<=pushTop;i++){
			if(pushStack[i] < minEle){
				minEle = pushStack[i];
			}
		}
		System.out.print("Minimum Element is: "+minEle);
		
	}	
	void display(){
		if(pushTop == -1 && popTop == -1){
			System.out.println("Stack is Empty");
		}
		if(pushTop != -1){
			for(int i=0;i<=pushTop;i++){
				System.out.print(pushStack[i]+" ");	
			}
			System.out.println();
		}
		
		if(popTop != -1){
			for(int i=0;i<=popTop;i++){
				System.out.print(popStack[i]+" ");	
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		StackGetMin s1 = new StackGetMin();
		
		s1.pushElement(10);
		s1.pushElement(20);
		s1.pushElement(5);
		s1.pushElement(40);
		s1.pushElement(50);
		
		s1.display();
		
		s1.getMin();
		
		
	}
}