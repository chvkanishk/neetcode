class Solution {
    public int[] product(int[] nums){
            int[] result = new int[nums.length];
            int left=1;
            for (int i =0;i<nums.length;i++){
                result[i]=left;
                left*=nums[i];

            }
            int right=1;
            for (int i=nums.length-1;i>=0;i--){
                result[i]*=right;
                right*=nums[i];
            }
            return result;
    }
}

public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution sol = new Solution();
        int[] result = sol.product(nums);
        for (int i=0;i<result.length;i++){  
            System.out.print(result[i]+" ");
        }
        
    }
}
