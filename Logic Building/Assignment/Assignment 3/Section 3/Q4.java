class Reverse{
	public static void main(String args[]){
		int num = 1234;
		int revnum = 0;
		while(num>0){
			int a = num%10;
			revnum = revnum*10 + a;
			num = num/10;
		}
		System.out.println("Reversed num: "+ revnum);
	}
}