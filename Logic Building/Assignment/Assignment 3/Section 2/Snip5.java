class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 

/*
1st Iteration
num=1	i=1
num-=i -> num=0

2nd Iteration
num=0	i=2
num+=i -> num=2

3rd Iteration
num=2	i=3
num-=i -> num=1

4nd Iteration
num=1	i=2
num+=i -> num=3

	//3

*/