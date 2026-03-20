
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] top(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key: map.keySet()){
            int f= map.get(key);
            if (bucket[f] == null){
                bucket[f]= new ArrayList<>();
            }
            bucket[f].add(key);
        }
            int[] result = new int[k];
            int index = 0;
            
            for (int i=bucket.length-1; i>=0 && index<k; i--){
                if(bucket[i]!= null){
                    for(int num : bucket[i]){
                        result[index++]= num;
                        if(index==k) return result;
                    }
                }
            }

        return result;
    }
}

public class KFrequentElements {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = sol.top(nums, k);
        for(int i: result){
            System.out.print(i + " ");
        }
    }
    
}
