
import java.util.*;


class Solution{
    public List<List<Integer>> Sum(int[] nums, int target){

        List<List<Integer>> result = new ArrayList<>();

        if (nums==null || nums.length <4) return result;

        Arrays.sort(nums);
        int n = nums.length;

        // First number loop with pruning
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            // Pruning: if min sum > target, break
            long minSum = (long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            if (minSum > target) break;

            // Pruning: if max sum < target, skip this i
            long maxSum = (long)nums[i] + nums[n-3] + nums[n-2] + nums[n-1];
            if (maxSum < target) continue;

            // Second number loop with pruning
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                // Pruning at second level
                minSum = (long)nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if (minSum > target) break;

                maxSum = (long)nums[i] + nums[j] + nums[n-2] + nums[n-1];
                if (maxSum < target) continue;

                // Two pointers for remaining two numbers
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates
                        while (left < right && nums[left] == nums[left+1]) left++;
                        while (left < right && nums[right] == nums[right-1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}

public class FourSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {1000000000,1000000000,1000000000,1000000000};
        int target1 = -294967296;
        System.out.println("Test 1: " + sol.Sum(nums1, target1));

        // Test case 2
        int[] nums2 = {-2, -1, 0, 1, 2};
        int target2 = 0;
        System.out.println("Test 2: " + sol.Sum(nums2, target2));

        // Test case 3
        int[] nums3 = {1, 0, -1, 0, -2, 2};
        int target3 = 0;
        System.out.println("Test 3: " + sol.Sum(nums3, target3));
    }

}
