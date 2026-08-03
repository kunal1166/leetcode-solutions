public class RemoveDuplicatesFromSortedArray {

    // Brute Force (Extra Array)
    public static int bruteForce(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] temp = new int[nums.length];
        temp[0] = nums[0];

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                temp[k] = nums[i];
                k++;
            }

        }

        // Copy back to original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }

    // Optimal (Two Pointers)
    public static int optimal(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

        }

        return i + 1;
    }

    // Print Array
    public static void printArray(int[] nums, int length) {

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] nums2 = {1, 1, 2, 2, 3, 4, 4, 5};

        int bruteLength = bruteForce(nums1);

        System.out.println("Brute Force:");
        System.out.println("Length = " + bruteLength);
        printArray(nums1, bruteLength);

        System.out.println();

        int optimalLength = optimal(nums2);

        System.out.println("Optimal:");
        System.out.println("Length = " + optimalLength);
        printArray(nums2, optimalLength);
    }
}