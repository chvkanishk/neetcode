import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public List<List<Integer>> threesum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        if(nums == null ||nums.length< 3){
            return result;
        }

        Arrays.sort(nums);

        for (int i=0; i<nums.length;i++){
            if (nums[i]>0) break;
            
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;
            int target= -nums[i];

            while (left<right){
                int sum = nums[left]+nums[right];

                if (sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    int lv = nums[left];
                    int rv = nums[right];

                    while(left < right && nums[left] == lv) left++;
                    while(left < right && nums[right] == rv) right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}

public class ThreeSome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = sol.threesum(nums);
        System.out.println(result);

        
        
    }
    
}
