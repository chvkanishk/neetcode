import java.util.*;

class Solution{
    public int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map =new HashMap<>();
        map.put(0,1);

        int count =0;
        int sum=0;

        for (int i : nums){
            sum+=i;

            if (map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(i,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3};
        int k = 3;
        int result = sol.subarraySum(nums, k);
        System.out.println(result);
        
    }
    
}
