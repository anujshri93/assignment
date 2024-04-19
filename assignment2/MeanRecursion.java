import java.util.Scanner;

public class MeanRecursion
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter  element :");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        double mean = findMean(arr);
        System.out.println("Mean : " + mean);
    }

    private static double findMean(int[] arr) {
        return findMeanRecursion(arr, 0) / (double) arr.length;
    }

    private static double findMeanRecursion(int[] arr, int index) {
                if (index == arr.length) {
            return 0;
        }

        return arr[index] + findMeanRecursion(arr, index + 1);
    }
}