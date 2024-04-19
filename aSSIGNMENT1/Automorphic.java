import java.util.*;

public class Automorphic {

    static boolean isAutomorphic(int n)
     {
        int sq = n* n;

        while (n > 0) {
            if (n % 10 != sq % 10)
                return false;
            n /= 10;
            sq /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isAutomorphic(num))
            System.out.println(num + " automorphic number.");
        else
            System.out.println(num + "  not an automorphic number.");
    }
}
