import java.util.Scanner;

public class ArmstrongNumber
 {

    static boolean isArmstrong(int n) {
        int sum = 0;
        int originalNumber = n;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == originalNumber;
    }

   
    public static void main(String args[])
    
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.println("Armstrong Numbers up to " + limit );//limit is 999
        for (int i = 0; i <= limit; i++)
         {
            if (isArmstrong(i)) 
            {
                System.out.print(i + " ");
            }
        }
    }
}
