import java.util.Arrays;

class Solution{
    public int find(int[] g, int[] s){
        int count=0;
        int i=0, j=0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};

        Solution s1 = new Solution();
        int result = s1.find(g, s);
        System.out.println(result);
        
    }
}
