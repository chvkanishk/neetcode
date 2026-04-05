
import java.util.Arrays;

public class PermutationinString {

    public boolean check(String s1, String s2){
        if(s1.length()> s2.length()) return false;

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            s2freq[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(s1freq, s2freq)) return true;

        int left =0;

        for(int right =s1.length(); right<s2.length();right++){

            s2freq[s2.charAt(right)-'a']++;
            s1freq[s2.charAt(left)-'a']++;
            left++;

            if(Arrays.equals(s1freq, s2freq)) return true;

        }
        return false;
    }
    public static void main(String[] args) {
        PermutationinString p = new PermutationinString();
        
        // Test cases
        System.out.println(p.check("ab", "eidbaooo")); // true
        System.out.println(p.check("ab", "eidboaoo")); // false
        System.out.println(p.check("adc", "dcda")); // true
        System.out.println(p.check("hello", "ooolleoooleh")); // false
    }
    
}
