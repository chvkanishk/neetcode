import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {

    public List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();
        
        if (s.length()<p.length()) return result;

        int[] pcount= new int[26];
        int[] wcount = new int[26];

        for(int i =0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
            wcount[s.charAt(i)-'a']++;
        }

        int m =0;
        for (int i= 0;i<26;i++){
            if (pcount[i]==wcount[i]) m++;
        }
        int l =0;
        for(int r=p.length();r<s.length();r++){
            if (m==26) result.add(l);

            int in=s.charAt(r)-'a';
            if (wcount[in]==pcount[in]) m--;
            wcount[in]++;
            if(wcount[in]==pcount[in]) m++;

            int out= s.charAt(l)-'a';
            if(wcount[out]==pcount[out]) m--;
            wcount[out]--;
            if(wcount[out] == pcount[out]) m++;

            l++;
        }
        if(m ==26) result.add(l);
        return result;

    }

    public static void main(String[] args) {
        FindAllAnagramsinaString solution = new FindAllAnagramsinaString();
        
        // Test case 1
        String s1 = "cbaebabacd";
        String p1 = "abc";
        List<Integer> result1 = solution.findAnagrams(s1, p1);
        System.out.println("Test case 1: s = \"" + s1 + "\", p = \"" + p1 + "\"");
        System.out.println("Result: " + result1);
        
        // Test case 2
        String s2 = "abab";
        String p2 = "ab";
        List<Integer> result2 = solution.findAnagrams(s2, p2);
        System.out.println("Test case 2: s = \"" + s2 + "\", p = \"" + p2 + "\"");
        System.out.println("Result: " + result2);
        
        // Test case 3
        String s3 = "aa";
        String p3 = "bb";
        List<Integer> result3 = solution.findAnagrams(s3, p3);
        System.out.println("Test case 3: s = \"" + s3 + "\", p = \"" + p3 + "\"");
        System.out.println("Result: " + result3);
    }
}
