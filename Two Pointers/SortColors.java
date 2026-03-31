class Solution{
    public void sort(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            switch(nums[mid]){
                case 0 -> swap(nums, mid++, low++);
                case 1 -> mid++;
                case 2 -> swap(nums, mid, high--);
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


public class SortColors {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,0,2,1,1,0};
        sol.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
    }
}
