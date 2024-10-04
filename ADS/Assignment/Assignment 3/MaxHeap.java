public class MaxHeap{
	
	void heapify(int[] arr, int size, int i){
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l < size && arr[l] > arr[largest]){
			largest = l;
		}
		if(r < size && arr[r] > arr[largest]){
			largest = r;
		}
		
		if(largest !=i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, size, largest);
		}	
	}
	
	void heapsort(int[] arr){
		int size = arr.length;
		
		for(int i= size/2-1;i>=0;i--){
			heapify(arr, size, i); // Max-Heap
		}
	}
	
	void display(int arr[])
	{
		int size = arr.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	}
	public static void main(String args[])
	{
		MaxHeap h1 = new MaxHeap();
		
		int arr[] = {12,7,15,5};
		h1.display(arr);
		
		h1.heapsort(arr);
		h1.display(arr);
	
	}
}