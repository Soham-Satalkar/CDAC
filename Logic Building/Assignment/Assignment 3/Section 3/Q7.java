class Sum{
	public static void main(String args[]){
		int sum=0;
		int n=9876;
		while(n>0){
			sum=n%10+sum;
			n=n/10;
		}
		System.out.println(sum);
	}
}