class Operator{
	public static void main(String args[]){
		int a=5;
		int b=10;
		int c= a++ + b-- + ++a - b--;
		System.out.println(a+" "+b+" "+c);
	}
}