public class CircularQueue{
	
	static int size = 5;
	static int[] queue = new int[size];
	static int front, rear;
	
	CircularQueue(){
		front = -1;
		rear = -1;
	}
	static boolean isEmpty(){
		return front == -1;
	}
	static boolean isFull(){
		return (rear + 1) % size == front ;
		
	}
	static void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else{
			if(front == -1){
				front = 0;
			}
			rear = (rear + 1) % size;
			queue[rear]  = data;
			System.out.println("Enqueued"+queue[rear]);
		}
	}
	static void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			int x = queue[front];
			if(front == rear){
				front = -1;
				rear = -1;
			}
			front = (front+1) % size;
			System.out.println("Dequeued"+x);
		}
	}
	
	public static void main(String args[]){
		CircularQueue q1 = new CircularQueue();
		
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		
		q1.dequeue();
		q1.dequeue();
	}
}