
import java.util.HashSet;
import java.util.Set;

class Solution{
    public int longest(int[] nums){
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        int l = 0;

        for (int i: set){
            if (!set.contains(i-1)){
                 int current= i;
                 int cl=1;

                 while (set.contains(current+1)){
                    current++;
                    cl++;
                 }
                l=Math.max(l, cl);
            }

        }
        return l;
        }
}

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = sol.longest(nums);
        System.out.println(result);
    }
    
}
