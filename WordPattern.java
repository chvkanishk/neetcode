
import java.util.HashMap;

class Solution{
    public boolean wordpattern(String pattern, String s){
        String[] words= s.split(" ");
        if(words.length!= pattern.length()){
            return false;
        }

        HashMap<Character,String> LtoW = new HashMap<>();
        HashMap<String,Character> WtoL = new HashMap<>();

        for (int i=0;i<pattern.length();i++){
            char letter = pattern.charAt(i);
            String word = words[i];

            if(LtoW.containsKey(letter)){
                String x= LtoW.get(letter);
                if(!x.equals(word)){
                    return false;
                }
            }else{
                LtoW.put(letter,word);
            }
            if (WtoL.containsKey(word)){
                char y = WtoL.get(word);
                if (y!=letter){
                    return false;
                }
            }else{
                WtoL.put(word, letter);
            }
        }
        return true;
    }
}

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        Solution sol = new Solution();
        boolean result = sol.wordpattern(pattern, s);
        System.out.println(result);
    
    }
}
