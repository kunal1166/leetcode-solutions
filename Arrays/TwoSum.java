import java.util.HashMap;

public class TwoSum {

    public static int[] bruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] optimal(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans1 = bruteForce(nums, target);
        System.out.println("Brute Force: " + ans1[0] + " " + ans1[1]);

        int[] ans2 = optimal(nums, target);
        System.out.println("Optimal: " + ans2[0] + " " + ans2[1]);
    }
}