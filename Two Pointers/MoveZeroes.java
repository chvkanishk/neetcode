class Solution{
    public void move(int[] nums){
        int l=0;
         for(int i=0; i<nums.length;i++){
            if(nums[i]!= 0){
                int temp = nums[i];
                nums[i]=nums[l];
                nums[l]=temp;

                l++;
            }
         }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,0,3,12};
        solution.move(nums);
        for(int i: nums){
            System.out.print(i+" ");
        }      
    }
    
}
