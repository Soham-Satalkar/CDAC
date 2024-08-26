class Fibonacci{
	public static void main(String args[]){
		int n1=0;
		int n2=1;
		int n=0;
		System.out.print(n1+" "+n2);
		for(int i=1;n<21;i++){
			n=n1+n2;
			System.out.print(" "+n);
			n1=n2;
			n2=n;
		}
	}
}