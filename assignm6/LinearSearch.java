public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == target) {
                return i;
            }
        }
       
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 1, 5, 9, 3};
        int target = 5;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
