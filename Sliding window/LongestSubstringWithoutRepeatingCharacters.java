
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
          int left=0;
          int result =0;

          HashSet<Character> set = new HashSet<>();

          for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(s.charAt(i));
            result= Math.max(result, i-left+1);
          }
        return result;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters sol = new LongestSubstringWithoutRepeatingCharacters();

        // Test cases
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // Expected: 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // Expected: 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // Expected: 3
    }
}
