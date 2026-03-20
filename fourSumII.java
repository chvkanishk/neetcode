
import java.util.HashMap;

class Solution{
    public int count(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            for(int j: nums2){
                int sum=i+j;
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        int count =0;

        for( int i : nums3){
            for (int j : nums4){
                int sum = i+j;
                int t = -sum;
                if (map.containsKey(t)){
                    count+= map.get(t);
                }

            }
        }

        return count;
    }
}


public class fourSumII {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};
        int result = sol.count(nums1, nums2, nums3, nums4);
        System.out.println(result);
        
    }
}
