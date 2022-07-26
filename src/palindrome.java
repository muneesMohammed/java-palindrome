import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        System.out.println("enter a number");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        temp=num;
        while(num>0){
            r= num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum){
            System.out.println("number is pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }
    }
}
