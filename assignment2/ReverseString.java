public class ReverseString
{
    public static void main(String[] args)
     {
        String input = " Hello World ! ";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }

    private static String reverseString(String str)
     {
        if (str.length() <= 1)
         {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}