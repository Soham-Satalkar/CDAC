class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
} 

/*
count=0

1st Iteration
i=0	
count = count + i++  - ++i
	  = 0	+ 0(i=1) - 2
	  = -2
i=2
	  
2nd Iteration
i=3
count = count + i++ - ++i
	  = -2	+ 2(3)  - 4
	  = -4

3rd Iteration
i=5
i>4
count = -4

*/