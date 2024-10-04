public class QueueUsingArray{
	
	static int size = 5;
	static int [] queue  = new int[size];
	static int front,rear;
	
	public QueueUsingArray(){
		front = -1;
		rear = -1;
	}
	
	public static void enqueue(int num){
		if(rear == size-1){
			System.out.println("Queue is Full.");
		}
		else{
			if(front == -1){
				front++;
			}
			rear++;
			queue[rear] = num;
			System.out.println("Enqueued element: "+queue[rear]);
		}
	}
	public static void dequeue(){
		if(front == -1){
			System.out.println("Queue is Empty.");
		}
		else{
			System.out.println("Dequeued element: "+queue[front]);
			if(front > rear || front == rear){
					front = -1;
					rear = -1;
			}
			front++;
		}
	}
	
	void display(){
		if(front == -1){
            System.out.println("\nQueue is empty");
        }
        else{
            System.out.println("\nElements");
            for(int i = front; i <= rear; i++){
                System.out.print(queue[i]+" ");
            }
        }
	}
	
	public static void main(String args[]){
		QueueUsingArray q1 = new QueueUsingArray();
		
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		
		q1.display();
	}
}