import java.util.*class SortElementsByFrequency {

    public static int[] sortByFrequency(int[] arr) {
      
        Map<Integer, Integer> frequencyMap = new TreeMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

      
        List<Integer> sortedList = new ArrayList<>();

      
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sortedList.add(key);
            }
        }

      
        int[] sortedArr = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            sortedArr[i] = sortedList.get(i);
        }

        return sortedArr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 4, 1, 4, 3, 2};
        int[] sortedArr = sortByFrequency(arr);

        System.out.println("Sorted elements by frequency:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
