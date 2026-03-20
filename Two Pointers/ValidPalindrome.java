class Solution{
    public boolean check(String s){
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");

        int left=0;
        int right= s.length()-1;

        while (left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }          
            left++;
            right--;
        }
        
        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args){
        Solution sol = new Solution();
        String s = "A man a plan a canal Panama";
        boolean result = sol.check(s);
        System.out.println(result);
    }    
}
