import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("Sum of array elements using recursion: " + calculateSumRecursive(inputArray, 0));
        scanner.close();
    }

    public static int calculateSumRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + calculateSumRecursive(arr, index + 1);
        }
    }
}