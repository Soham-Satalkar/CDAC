public class MinHeap{
	int size;
	int[] arr;
	
	public MinHeap(int[] arr){
		this.arr = arr;
		this.size = arr.length;
	}
	
	void heapify(int[] arr, int size, int i){
		int smallest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l < size && arr[l] < arr[smallest]){
			smallest = l;
		}
		if(r < size && arr[r] < arr[smallest]){
			smallest = r;
		}
		
		if(smallest !=i){
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			
			heapify(arr, size, smallest);
		}	
	}
	
	void minHeap(){		
		for(int i= size/2-1;i>=0;i--){
			heapify(arr, size, i); // Min-Heap
		}
	}
	
	public int extractMin(){
		if(size<=0){
			throw new IllegalStateException("Heap is empty");
		}
		
		int minValue = arr[0];
		
		arr[0] = arr[size - 1];
		size--;
		
		heapify(arr, size, 0);
		
		return minValue;
	}
	
	void display(int arr[])
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	}
	public static void main(String args[])
	{		
		int arr[] = {10, 23, 5, 100, 3, 54, 18};
		MinHeap h1 = new MinHeap(arr);
		h1.display(arr);
		h1.minHeap();
		h1.display(arr);
		
		int minValue = h1.extractMin();
		System.out.println("Extracted Min: "+ minValue);
		h1.display(arr);
		
		int minValue2 = h1.extractMin();
		System.out.println("Extracted Min: "+ minValue2);
		h1.display(arr);
	
	}
}