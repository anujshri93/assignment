public class SortColors {

    public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }

    
        int i = 0;
        while (count0 > 0) {
            nums[i++] = 0;
            count0--;
        }
        while (count1 > 0) {
            nums[i++] = 1;
            count1--;
        }
        while (count2 > 0) {
            nums[i++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
