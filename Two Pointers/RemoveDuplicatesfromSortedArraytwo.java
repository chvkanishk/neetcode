class solution{
    public int duplicate(int[] nums){
        int x=2;

        for(int i=2;i<nums.length;i++){
            if (nums[i]!= nums[x-2]){
                nums[x]= nums[i];
                x++;
            }
        }
        return x;
    }
}

public class RemoveDuplicatesfromSortedArraytwo {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        solution solution = new solution();
        int newLength = solution.duplicate(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }    
}
