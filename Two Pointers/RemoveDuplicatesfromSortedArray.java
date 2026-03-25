class Solution{
    public int remove(int[] nums){
        int j = 1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]!= nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}


public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution solution = new Solution();
        int newLength = solution.remove(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }
}
