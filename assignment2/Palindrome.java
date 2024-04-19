import java.util.Scanner;

public class Palindrome 
{
    public static boolean isPalindrome(String str) {
        return isSubstringEqual(str, 0, str.length() - 1);
    }

    private static boolean isSubstringEqual(String s, int start, int end) {
        if (start >= end)
         {
            return true; 
        }
         else if (s.charAt(start) == s.charAt(end)) {
            return isSubstringEqual(s, start + 1, end - 1); 
        } 
        else
         {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check is palindrome: ");
        String str = sc.nextLine();
        boolean isInputStringPalindrome = isPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isInputStringPalindrome);
    }
}