
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution{
     public List<List<String>> groupanagram(String[] strs){
        
        HashMap <String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (char c : s.toCharArray()){
                count[c -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for( int num : count){
                sb.append(num).append('.');
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);

        }
        return new ArrayList<>(ans.values());
     }
}


public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        System.out.print(solution.groupanagram(strs));
    }
}
