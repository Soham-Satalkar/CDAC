class Pattern{
	public static void main(String args[]){
		int n=5;
		int count=5;
		for(int i=1;i<=n;i++){
			for(int s=1;s<=i-1;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=count;j++){
				System.out.print("* ");
			}
			count--;
			System.out.println();
		}
	}
}