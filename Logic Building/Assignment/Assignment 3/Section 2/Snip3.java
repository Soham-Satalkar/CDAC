class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
}

/*

count=0	//0
count++

count=1	//0 1
count++

count=2	//0 1 2
count++

count==3

		// 0 1 2 3


*/