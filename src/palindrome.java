import java.util.Scanner;

public class strinpalindrome {
    public static void main(String[] args) {
        int n = 1;
        while (n > 0) {
            String word, reverse = "";
            System.out.println("enter a sring value");
            Scanner in = new Scanner(System.in);
            word = in.nextLine();
            int len = word.length();
            for (int i = len - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            if (word.equals(reverse)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}