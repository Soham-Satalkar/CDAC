class Pattern{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=2*n;i++){
			int k=i>n?2*n-i:i;
			int space=n-k;
			for(int s=1;s<=space;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++){
				System.out.print("* ");
				if(j<i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}