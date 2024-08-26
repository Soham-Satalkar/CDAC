class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
}

/*
a=10	b=5

result = ++a * b-- - --a + b++
       = 11 * 5(b=4) - 10 + 4(b=5)
	   = 11 * 5 - 10 + 4
	   = 49

*/