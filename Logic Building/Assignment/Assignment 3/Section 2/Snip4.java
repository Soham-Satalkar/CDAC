class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
}

/*
i=1	//	1
i++	-> i=2
i<5	
i=2	//	1 2
i++	-> i=3
i<5	
i=3	//	1 2 3
i++	-> i=4
i<5	
i=4	//	1 2 3 4
i++	-> i=5
i==5
	// 1 2 3 4 5

*/