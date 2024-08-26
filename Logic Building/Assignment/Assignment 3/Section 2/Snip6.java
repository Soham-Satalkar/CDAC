class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
}

/*

x=5
y =	++x	-  x--	  +	  --x	+	x++
  =  6  -  6(x=5) +    4	+    4(x=5)
  = 6-6+4+4
y =8
*/