class LargestofThree{
	public static void main(String args[]){
		
		int n1 = 2;
		int n2 = 10;
		int n3 = 5;
		
		if(n1>n2){
			if(n1>n3){
				System.out.println("N1 is Largest");
			}
			else{
				System.out.println("N3 is Largest");
			}
			
		}
		else if(n2>n3){
			System.out.println("N2 is Largest");
		}
		else{
			System.out.println("N3 is Largest");
		}
	}
}