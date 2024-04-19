public class QuickSort {
    public void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; 
        }
        int n = arr.length;
        quickSort(arr, 0, n - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
          
            int pi = partition(arr, low, high);
         
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        int pivot = arr[high];
        int i = low - 1; 

        for (int j = low; j < high; j++) {
           
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
      
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort sorter = new QuickSort();
        sorter.quickSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
