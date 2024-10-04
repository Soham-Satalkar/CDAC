public class CircularQueueUsingArray{
	int size = 5;
	int[] queue = new int[size];
	int front,rear;
	
	CircularQueueUsingArray(){
		front = -1;
		rear = -1;
	}
	
	void enqueue(int data){
		if((rear + 1) % size == front){
			System.out.println("Queue is Full.");
		}
		else{
			if(front == -1){
				front = 0;
			}
			
			rear = (rear+1)%size;
			queue[rear] = data;
			System.out.println("Enqueued: " + data);
			
		}
	}
	void dequeue(){
		if(front == -1){
			System.out.println("Queue is Empty.");
		}
		else{
			int data = queue[front];
            System.out.println("\n"+data+" dequeued");
			if(front == rear){
				front = -1;
				rear = -1;
			}
			front = (front+1)%size;
		}
	}
	
	void display(){
        if(front == -1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i!=rear;i=(i+1)%size){
                System.out.print(queue[i]+" ");
            }
            System.out.print(queue[rear]);
            System.out.println();
        }
    }
	
	public static void main(String args[]){
		CircularQueueUsingArray q1 = new CircularQueueUsingArray();
		
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
	
		q1.display();
		
		q1.dequeue();
		
		q1.display();
		
	}
}