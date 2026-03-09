
import java.util.HashMap;

class solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i= 0; i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return true;
            }
            else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}

public class ContainDuplicates {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};
        solution sol = new solution();
        System.out.println(sol.containsDuplicate(nums));
    }
}
