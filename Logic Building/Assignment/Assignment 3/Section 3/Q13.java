class Pattern{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=2*n;i++){
			int count = i>n?2*n-i+1:i;
			int k = i>n?2*n-i+1:i;                
			for(int j=1;j<=k;j++){
				System.out.print(count);
				if(j<count)
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}