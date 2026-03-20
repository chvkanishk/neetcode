
import java.util.HashMap;

class Solution{
    public int length(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);

        int score = 0;
        int lenght =0;

        for(int i=0; i<nums.length; i++){
            if (nums[i]==0){
                score-=1;
            }else{
                score+=1;
            }
            if (map.containsKey(score)){
                int l = i- map.get(score);
                lenght= Math.max(l, lenght);
            }
            else{
                map.put(score,i);
            }
        }
        return lenght;
    }
}


public class ContineousArray {
    public static void main(String[] args){
        int[] nums = {0,1,0};
        Solution sol = new Solution();
        int result = sol.length(nums);
        System.out.println(result);

    }
}