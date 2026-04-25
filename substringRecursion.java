import java.util.Scanner;

public class substringRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the recursion palindrome string");
        System.out.print("Please enter the string: ");
        String str = input.next();
        System.out.println("Your string is" + ((isPalindrome(str) ? "palindome" : "not Palindrome")));

    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)) {
            return false;

        }
        String newStr = str.substring(1, lastpos);
        return isPalindrome(newStr);

    }
}