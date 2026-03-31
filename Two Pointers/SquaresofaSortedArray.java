class Solution{
    public int[] sort(int[] nums){
        int[] result =new int[nums.length];

        int left=0 ,right= nums.length-1, idx = nums.length-1;

        while(left<=right){
            int ls=nums[left]* nums[left];
            int rs = nums[right]* nums[right];

            if(ls >rs){
                result[idx--] =ls;
                left++;
            }else{
                result[idx--]= rs;
                right--;
            }
        }
        return result;
    }
}

public class SquaresofaSortedArray {
    public static void main(String[] args) {
            int[] nums ={-4,-1,0,3,10};
            Solution s = new Solution();
            int[] result = s.sort(nums);
            for(int i: result){
                System.out.print(i+" ");
            }
    }
}
