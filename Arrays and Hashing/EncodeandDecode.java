import java.util.*;


class codec {
    public String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s){
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, j));
            strs.add(s.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return strs;
    }
}


public class EncodeandDecode {
    public static void main(String[] args) {
        codec c = new codec();
        List<String> strs = Arrays.asList("hello", "world", "java");
        String encoded = c.encode(strs);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = c.decode(encoded);
        System.out.println("Decoded: " + decoded);
        
    }
    
}
