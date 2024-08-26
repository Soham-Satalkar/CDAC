class Pattern{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=2*n-1;i++){
			int k=i>n?i-n+1:n-i+1;
			int space=n-k;
			for(int s=1;s<=space;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++){
				System.out.print("* ");
				if(j<k){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}