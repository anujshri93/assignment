import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        String binaryNum = decimalToBinary(decimalNumber);
        System.out.println("Binary value of " + decimalNumber + ": " + binaryNum);
    }

    private static String decimalToBinary(int decimal)
     {
        if (decimal == 0)
         {
            return "";
        }
         else if (decimal == 1)
         {
            return "1";
        } 
        else
         {
            return decimalToBinary(decimal / 2) + (decimal % 2 == 0 ? "0" : "1");
        }
    }
}