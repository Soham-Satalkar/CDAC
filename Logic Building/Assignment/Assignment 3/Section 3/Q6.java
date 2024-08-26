class Prime{
	public static void main(String args[]){
		int count =0;
		int num=2;
		while(count<5){
			boolean prime = true;
			if(num<2){
				prime = false;
			}
			else{
				for(int i=2;i*i<=num;i++){
					if(num % i ==0){
						prime = false;
						break;
					}
				}
			}
			if(prime){
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
}