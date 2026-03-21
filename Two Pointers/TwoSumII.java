class Solution{
    public int[] twosum(int[] numbers, int target){
        int right=numbers.length-1;
        int left = 0;

        while(left<right){
            int sum = numbers[left]+numbers[right];

            if (sum == target){
                return new int[] {left+1,right+1};
            }else if(sum> target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}

public class TwoSumII {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = sol.twosum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    
}
