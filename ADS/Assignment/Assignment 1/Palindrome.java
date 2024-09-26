import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = input.nextInt();

        int sum=0,temp;
        temp=n;

        while(n>0){
            int r = n%10;
            sum = (sum*10) + r;
            n = n/10;
        }

        if(sum==temp){
            System.out.println("The given Number is Palindrome" );
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
