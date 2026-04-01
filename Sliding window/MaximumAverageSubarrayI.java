class Solution{
    public double Average(int[] nums, int k){
        double sum= 0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }

        double average=sum;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];

            average= Math.max(average,sum);
        }
        return average/k;
    }
}

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        Solution solution = new Solution();
        double result = solution.Average(nums, k);
        System.out.println(result);
        
    }
}
