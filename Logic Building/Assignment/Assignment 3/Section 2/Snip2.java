class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
}

/*

i=5	total=0 
total+=i	-> total=5
i!=3
total-=1	-> total=4

i=4 total=4
total+=i	-> total=8
i!=3
total-=1	-> total=7

i=3 total=7
total+=i	-> total=10
i==3

i=2 total=10
total+=i	-> total=12
i!=3
total-=1	-> total=11

i=1 total=11
total+=i	-> total=12
i!=3
total-=1	-> total=11


*/

