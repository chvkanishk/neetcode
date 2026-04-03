public class LongestRepeatingCharacterReplacement {
    public int solution(String s, int k){
        int[] freq = new int[26];
        int maxfreq=0;
        int left =0;
        int maxlen = 0;
        

        for (int right =0 ; right<s.length();right++){
            
            int idx= s.charAt(right)-'A';
            freq[idx]++;
            maxfreq = Math.max(maxfreq, freq[idx]);
            
            while (right - left + 1 - maxfreq > k) {
                int leftIdx = s.charAt(left) - 'A';
                freq[leftIdx]--;
                left++;
                maxfreq = 0;
                for (int f : freq) {
                    maxfreq = Math.max(maxfreq, f);
                }
            }
            
            maxlen = Math.max(maxlen, right - left + 1);
        }
        
        return maxlen;
    }


    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement sol = new LongestRepeatingCharacterReplacement();
        
        // Test case 1: "ABAB", k=2 -> 4
        System.out.println(sol.solution("ABAB", 2)); // Expected: 4
        
        // Test case 2: "AABABBA", k=1 -> 4
        System.out.println(sol.solution("AABABBA", 1)); // Expected: 4
        
        // Test case 3: "AAAA", k=0 -> 4
        System.out.println(sol.solution("AAAA", 0)); // Expected: 4
        
        // Test case 4: "ABCDE", k=1 -> 2
        System.out.println(sol.solution("ABCDE", 1)); // Expected: 2
    }
}
