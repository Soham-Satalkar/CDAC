public class QueueUsingStack{
	int size = 5;
	int[] pushStack = new int[size];
	int[] popStack = new int[size];
	
	int pushHead = -1;
	int popHead = -1;
	
	void pushElement(int data){
		if(pushHead == size-1){
			System.out.println("Queue is Full");
		}
		pushHead++;
		pushStack[pushHead] = data;
		System.out.println("Enqueued: "+pushStack[pushHead]);
	}
	
	void popElement(){
		if(popHead == -1){
			if(pushHead == -1){
				System.out.println("Queue is Empty");
			}
			while(pushHead != -1){
				popHead++;
				popStack[popHead] = pushStack[pushHead];
				pushHead--;
			}
		}
		System.out.println("Dequeued: "+popStack[popHead]);
		popHead--;
	}
	
	void display(){
		if(pushHead == -1 && popHead == -1){
			System.out.println("Queue is Empty");
		}
		if(pushHead != -1){
			for(int i=0;i<=pushHead;i++){
				System.out.print(pushStack[i]+" ");	
			}
			System.out.println();
		}
		
		if(popHead != -1){
			for(int i=0;i<=popHead;i++){
				System.out.print(popStack[i]+" ");	
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		QueueUsingStack q1 = new QueueUsingStack();
		
		q1.pushElement(10);
		q1.pushElement(20);
		q1.pushElement(30);
		q1.display();
		
		q1.popElement();
		q1.display();
		
		q1.popElement();
		q1.display();
		
		q1.popElement();
		q1.display();
	}
}