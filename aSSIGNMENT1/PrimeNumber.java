import java.util.Scanner;



public class PrimeNumber {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner s = new Scanner(System.in);
        
       
        System.out.print("Enter a Number: ");
        num = s.nextInt();
        
      
        if (num == 0 || num == 1) {
            System.out.println("\nIt is not a Prime Number.");
            return;
        }
        
      
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                                break; 
            }
        }
        
        
        if (count == 0)
            System.out.println("\nIt is a Prime Number.");
        else
            System.out.println("\nIt is not a Prime Number.");
    }
}
