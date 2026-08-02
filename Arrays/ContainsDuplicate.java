import java.util.HashSet;
class ContainsDuplicate {
    public boolean bruteForce(int[] nums){
        for (int i=0 ; i < nums.length ; i++){
            for(int j=i+1; j< nums.length ; j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean optimal(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if(!set.contains(num)){
                set.add(num);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1,2,3,5,5,6};
        boolean hasDuplicate = solution.bruteForce(nums);
        System.out.println("Contains Duplicate: " + hasDuplicate);
        hasDuplicate = solution.optimal(nums);
        System.out.println("Contains Duplicate (optimal): " + hasDuplicate);
    }
}